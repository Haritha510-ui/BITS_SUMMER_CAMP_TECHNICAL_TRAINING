package Day8;

import java.util.ArrayList;
import java.util.TreeSet;

public class ArrayListToTreeSet {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Mango");
        list.add("Apple");
        list.add("Banana");

        // Convert ArrayList to TreeSet
        TreeSet<String> set = new TreeSet<>(list);

        // Print TreeSet elements
        System.out.println(set);
    }
}