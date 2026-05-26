package Day8;

import java.util.HashMap;

public class MapInterface {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Ravi");
        map.put(2, "Raju");
        map.put(3, "Sai");
        map.put(4, "Tharun");
        for(Integer c : map.keySet()) {
        System.out.println(c + " : " + map.get(c));
        }
    }
}
