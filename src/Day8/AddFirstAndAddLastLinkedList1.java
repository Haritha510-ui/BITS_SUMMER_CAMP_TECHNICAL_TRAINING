package Day8;

import java.util.LinkedList;

public class AddFirstAndAddLastLinkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(90);
        System.out.println(list);
        list.addFirst(89);
        System.out.println(list);
        list.addLast(890);
        System.out.println(list);
    }
}
