package CB_LinkList;
import java.util.*;

public class LLUse {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        list.addFirst(10);
        list.addFirst(40);
        list.addFirst(50);
        list.display();
        System.out.println();
        list.addAt(sc.nextInt(), sc.nextInt());
        System.out.println();
        list.display();
        
    }
}
