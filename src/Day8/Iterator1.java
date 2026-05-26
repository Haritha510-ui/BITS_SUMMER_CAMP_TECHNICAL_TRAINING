package Day8;

import java.util.HashSet;
import java.util.Iterator;

public class Iterator1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(5);
        Iterator<Integer> s = set.iterator();
        while (s.hasNext()) {
            System.out.println(s.next());
        }
    }
}
