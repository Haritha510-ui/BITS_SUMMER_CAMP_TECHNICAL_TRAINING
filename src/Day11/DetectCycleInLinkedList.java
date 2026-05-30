package Day11;

public class DetectCycleInLinkedList {
    public static boolean hasCycle(LinkedList ll) {
        if (ll.head == null) {
            return false;
        }

        Node slow = ll.head;
        Node fast = ll.head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(ll, 1);
        ll.addLast(ll, 2);
        ll.addLast(ll, 3);
        ll.addLast(ll, 4);

        // Creating a cycle for testing
        ll.head.next.next.next = ll.head;  // ll.head.next.next.next = ll.head; ----> output: Does the linked list have a cycle? false;
        System.out.println("Does the linked list have a cycle? " + hasCycle(ll)); // Output: Does the linked list have a cycle? true;
        //  because we created a cycle by pointing the last node back to the head.
    }
}
