package CB_LinkList;

public class LinkedList {

    
    // {about Node class} -
    // -> We made "Node" class as an inner class of "LinkedList" class because "Node" is the property of the "LinkedList".
    // -> We didn't wanted that, any other class other than "LinkedList" class should be able to make object from it.
    private class Node {
        int data;
        Node next;
    }


    public static final int val = 0;

    
    // {about head, tail, size} -
    // head/ tail/ size is the property of "LinkedList" class, so we kept it private. No other class other than "LinkedList" class should have the permission to access it and change it's value.
    private Node head;
    private Node tail;
    private int size;
    


    // {about display() method} - this method will print the data in the nodes
    public void display() {
        Node temp = this.head; // this.head refers to the class data member.
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


    public void addLast(int item){
        
        // create a new node
        Node nn = new Node();
        nn.data = item;
        nn.next = null;

        // attach (if there is already existing LL we have to update the tail) 
        if(this.size >= 1){
            this.tail.next = nn;
        }

        // update summary object
        if(this.size == 0){
            this.head = nn; // if there is no node in the LL, head will points to the newly created Node.
            this.tail = nn; // if there is no node in the LL, tail will also points to the newly created Node.
            this.size++; // we increment the size of the LL.
        }else{
            this.tail = nn; // if there is existing LL, then the tail will points to the newly created Node.
            this.size++; // we increment the size of the LL.
        }
    }


    public void addFirst(int item){

        // create a new node 
        Node nn = new Node();
        nn.data = item;
        nn.next = null;

        // attach the newly created node to the existing LL
        if(this.size >= 1){
            nn.next = this.head;
        }


        // update summary object
        if(size == 0){
            this.head = nn; // if there is no node in the LL, head will points to the newly created Node.
            this.tail = nn; // if there is no node in the LL, tail will also points to the newly created Node.
            this.size++; // we increment the size of the LL.
        }
        else{
            this.head = nn; // if there is existing LL, then the head will points to the newly created Node.
            this.size++; // we increment the size of the LL.
        }
    }

    public int getFirst() throws Exception{
        if(this.size == 0){ // Throw an exception "LL is empty" when user wants to get the first element.
            throw new Exception("Linked List is empty");
        }
        return this.head.data; // return the "head.data" to which the "head" is currently pointing.
    }

    
    public int getLast() throws Exception{
        if(this.size == 0){ // Throw an exception "LL is empty" when user wants to get the last element.
            throw new Exception("Linked List is empty");
        }
        return this.tail.data; // return the "tail.data" to which the "tail" is currently pointing.
    }

    public int getAt(int idx) throws Exception{
        if(size == 0){
            throw new Exception("Linked List is Empty"); // Throw an exception "LL is empty" when user wants to get the element at any index.
        }
        if(idx < 0 || idx>= size){
            throw new Exception("Invalid Index"); // Throw an exception "Invalid Index" when user wants to get the element at the "idx", which is greater than "this.size".
        }

        Node temp = this.head; // make a temp of type "node".
        for(int i = 1; i <= idx; i++){ // iterate to the desired "node".
            temp = temp.next;
        }
        return temp.data; // return the "data" when temp is at the desired position.
    }


    public Node getNodeAt(int idx) throws Exception{
        if(size == 0){
            throw new Exception("Linked List is Empty"); // Throw an exception "LL is empty" when user wants to get the "Node" at any index.
        }
        if(idx < 0 || idx>= size){
            throw new Exception("Invalid Index"); // Throw an exception "Invalid Index" when user wants to get the "Node" at the "idx", which is greater than "this.size".
        }

        Node temp = this.head; // make a temp of type "node".
        for(int i = 1; i <= idx; i++){ // iterate to the desired "node".
            temp = temp.next;
        }
        return temp; // return the "node" when temp is at the desired position.
    }

    public void addAt(int item, int idx) throws Exception{
        
        if(idx < 0 || idx > size){
            throw new Exception("Invalid Index"); // if the index entered by the user is greater than "this.size" or less than "0", then throw an exception.
        }

        if(idx == 0){   // when user wants to add element at the first position then call the function "addFirst()".
            addFirst(item);
        }
        else if(idx == this.size){      // when user wants to add element at the last position then call the function "addLast()".
            addLast(item);
        }
        else{   // code to add a node in between the exixting LL.

            // create a new node.
            Node nn = new Node();
            nn.data = item;
            nn.next = null;

            // attach the node to the existing LL.
            Node nm1 = getNodeAt(idx - 1); // store the address of the "n - 1" node in a variable "nm1".
            Node np1 = nm1.next; // store the address of the "n + 1" node in a variable "np1".
            nm1.next = nn; // first copy the "nn" address to the "nm1".
            nn.next = np1; // lastly copy the "np1" address to the "nn".
            // the above lines will actually copy the addresses to the correct places.


            // update summary object
            this.size++;
        }
    }

    public int removeFirst() throws Exception {
        if(size == 0){
            throw new Exception("Linked List is empty");
        }
        
        int rv = this.head.data; // if the LL has Node, capture the value of the data where head is pointing.

        if(size == 1){  // if there is only one element in the LL then, after removing it from LL, "head" and "tail" will point to "null".
            this.head = null;
            this.tail = null;
            
            // update summary object
            this.size = 0;

        }
        else{
            this.head = this.head.next; // set the head to the next node.

            // update summary object
            this.size--;
        }
        return rv;
    }

    public int removeLast() throws Exception {

        if(size == 0){ // throw exception when size is zero
            throw new Exception("Linked List is empty");
        }
        
        int rv = this.tail.data; // if the LL has Node, capture the value of the data where tail is pointing.

        if(size == 1){  // if there is only one element in the LL then, after removing it from LL, "head" and "tail" will point to "null".
            this.head = null;
            this.tail = null;
            
            // update summary object
            this.size = 0;

        }
        else{ // if there are nodes present in the LL --->
            Node lnm2 = getNodeAt(this.size - 2); // get the address of the last second node.
            this.tail = lnm2;
            this.tail.next = null;

            // update summary object
            this.size--;
        }
        return rv;
    }

    public int removeAt(int idx) throws Exception{
        if(this.size == 0){ // throw exception when LL is empty
            throw new Exception("LL is empty");
        }

        if(idx < 0 || idx >= this.size){ // if the given input of index is not in range of the LL.
            throw new Exception("Invalid index");
        }

        if(idx == 0){ // if the given index is "0", it means that user wants to remove the first "Node" from the LL, then we can use "removeFirst()" method, which we already wrote.
            return removeFirst();
        }
        else if(idx == this.size - 1){ // if the given index is "size-1", it means that user wants to remove the last "Node" from the LL, then we can use "removeLast()" method, which we already wrote.
            return removeLast();
        }
        else{
            Node nm1 = getNodeAt(idx - 1); // store the address of the Node at "index-1" in "nm1".
            Node n = getNodeAt(idx); // store the address of the Node at "index" in "n".
            Node np1 = getNodeAt(idx + 1); // store the address of the Node at "index+1" in "np1".

            nm1.next = np1; // update the value of the "Node.next" at "index-1" with the address of the node at "index+1". This will break the link with the "nth" node and the "nth" node will be removed.

            // update the summary object
            this.size--;

            // return the value of the removed node.
            return n.data;
        }

    }

    public void reverseData() throws Exception{
        // here we are using kind of two pointer approach. Where we are going to get the left and the right nodes, and then swap the "node.data" with each other.
        
        int left = 0;  // set the left pointer to the starting node.
        int right = size - 1; // set the right pointer at last node.
        while(left < right){
            Node ln = getNodeAt(left); // get the address of the left node.
            Node rn = getNodeAt(right); // get the address of the right node.

            int temp = ln.data; // swap the data of the nodes using a temp variable.
            ln.data = rn.data;
            rn.data = temp;

            left++;  // increment left for while loop.
            right--;  // decrement right for while loop.
        }
    }

    public void reversePointers(){
        Node prev = this.head;
        Node curr = prev.next;
        
        while(curr != null){
            Node ahead = curr.next;
            curr.next = prev; 

            prev = curr;
            curr = ahead;
        }

        // swap the head and the tail
        Node t = this.head;
        this.head = this.tail;
        this.tail = t;

        // set the value of the tail.next as "null", after reversing head and tail. 
        this.tail.next = null;
    }

    public int midOfLinkedList(){
        Node slow = this.head;
        Node fast = this.head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    public Node mergeTwoLists(Node l1, Node l2) {
        Node main_head = new Node();
        Node temp = main_head;
        while(l1 != null && l2 != null){
            if(l1.data > l2.data){
                temp.next = l2;
                l2 = l2.next;
            }
            else if(l1.data <= l2.data){
                temp.next = l1;
                l1 = l1.next;
            }
            temp = temp.next;
        }
        
        if(l1 != null){
            temp.next = l1;
        }
        if(l2 != null){
            temp.next = l2;
        }
        
        return main_head.next;
    }

    

}

