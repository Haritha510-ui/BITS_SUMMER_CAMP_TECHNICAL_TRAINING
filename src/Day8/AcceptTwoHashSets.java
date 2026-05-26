package Day8;

import java.util.HashSet;

public class AcceptTwoHashSets {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(5);
        s1.add(3);
        HashSet<Integer> s2 = new HashSet<>();
        s2.add(4);
        s2.add(5);
        s2.add(6);
        s1.addAll(s2);
        System.out.println(s1);
    }
}
