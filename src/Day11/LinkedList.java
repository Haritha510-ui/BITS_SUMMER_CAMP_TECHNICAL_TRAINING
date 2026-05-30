package Day11;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    public static void addFirst(LinkedList ll, int data) {
        Node nn = new Node(data);

        if (ll.head == null) {
            ll.head = nn;
            return;
        }

        nn.next = ll.head;
        ll.head = nn;
    }

    public void pl() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public void Count() {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Count of LinkedList is: " + count);
    }

    public void addLast(LinkedList ll, int data) {
        Node nn = new Node(data);

        if (ll.head == null) {
            ll.head = nn;
            return;
        }

        Node temp = ll.head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = nn;
    }

    public void deleteFirst(LinkedList ll) {
        if (ll.head == null) {
            System.out.println("LinkedList is empty");
            return;
        }

        ll.head = ll.head.next;
    }

    public void deleteLast(LinkedList ll) {
        if (ll.head == null) {
            System.out.println("LinkedList is empty");
            return;
        }

        if (ll.head.next == null) {
            ll.head = null;
            return;
        }

        Node temp = ll.head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        addFirst(ll, 99);
        addFirst(ll, 100);

        ll.addLast(ll, 101);
        ll.addLast(ll, 102);

        System.out.println(ll.head.data);
        System.out.println(ll.head.next.data);
        System.out.println(ll.head.next.next.data);
        System.out.println(ll.head.next.next.next.data);

        ll.pl();
        ll.Count();
        ll.deleteFirst(ll);
        ll.pl();
        ll.Count();
        ll.deleteLast(ll);
        ll.pl();
        ll.Count();
    }
}