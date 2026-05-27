package Day8;

import java.util.HashMap;
import java.util.Scanner;

public class MapInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Ravi");
        map.put(2, "Raju");
        map.put(3, "Sai");
        map.put(4, "Tharun");
        for(Integer c : map.keySet()) {
        System.out.println(c + " : " + map.get(c)); 
        }
        sc.close();
    }
}
