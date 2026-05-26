package Day8;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        // Convert ArrayList to Array
        String[] arr = list.toArray(new String[0]);

        // Print array elements
        for(String i : arr) {
            System.out.println(i);
        }
    }
}
