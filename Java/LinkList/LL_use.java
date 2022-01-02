package LinkList;

import java.util.*;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        next = null;
    }
}

public class LL_use {
    public static void print(Node<Integer> head) {
        // to print the LL<Integer>
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static Node<Integer> takeInput() {
        // Take input until user enters -1.
        Node<Integer> head = null, tail = null;
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        while (data != -1) {
            Node<Integer> newNode = new Node<>(data);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            data = s.nextInt();
        }
        s.close();
        return head;
    }

    public static Node<Integer> insert(Node<Integer> head, int data, int pos) {
        // insert new node in specific position
        Node<Integer> newNode = new Node<Integer>(data);
        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return head;
        }
        Node<Integer> temp = head;
        int i = 0;
        while (i < pos - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    public static Node<Integer> delete(Node<Integer> head, int pos) {
        // delete element at a specific position
        Node<Integer> temp = head;
        if (pos == 0) {
            head = head.next;
            return head;
        }

        int i = 0;
        while (i++ < pos - 1)
            temp = temp.next;
        temp.next = temp.next.next;
        return head;
    }

    public static void main(String[] args) {
        
    }

}
