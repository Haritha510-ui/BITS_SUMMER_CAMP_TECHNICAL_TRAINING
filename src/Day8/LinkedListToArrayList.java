package Day8;

import java.util.LinkedList;
import java.util.ArrayList;

public class LinkedListToArrayList {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("Python");
        list.add("C");

        // Convert LinkedList to ArrayList
        ArrayList<String> arr = new ArrayList<>(list);

        // Print ArrayList
        System.out.println(arr);
    }
}
