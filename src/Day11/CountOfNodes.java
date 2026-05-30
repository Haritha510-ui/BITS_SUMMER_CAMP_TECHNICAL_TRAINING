package Day11;

public class CountOfNodes {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        LinkedList.addFirst(ll, 99);
        LinkedList.addFirst(ll, 100);
        System.out.println(countOfNodes(ll.head));
    }
    public static int countOfNodes(Node head) {
        if(head == null) {
            return 0;
        }
        return 1 + countOfNodes(head.next);
    }
}
