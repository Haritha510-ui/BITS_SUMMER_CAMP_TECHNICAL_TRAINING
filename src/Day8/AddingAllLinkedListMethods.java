package Day8;

import java.util.LinkedList;

public class AddingAllLinkedListMethods {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(90);
        System.out.println(list);
        list.addFirst(89);
        System.out.println(list);
        list.addLast(890);
        System.out.println(list);
        list.offer(79);
        System.out.println(list);
        list.offerFirst(42);
        System.out.println(list);
        list.offerLast(12);
        System.out.println(list);
        list.get(31);
        System.out.println(list);
        list.getFirst();
        System.out.println(list);
        list.getLast();
        System.out.println(list);
        list.peek();
        System.out.println(list);
        list.peekFirst();
        System.out.println(list);
        list.peekLast();
        System.out.println(list);
        list.remove();
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.poll();
        System.out.println(list);
    }
}
