package Day8;

import java.util.HashSet;

public class TwoHashSetPrblm {
     public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(5);
        s1.add(3);
        HashSet<Integer> s2 = new HashSet<>();
        s2.add(1);
        s2.add(5);
        s2.add(3);
        System.out.println(s1.containsAll(s2)); // output: true becouse s1 contains all the elements of s2
     }
}


// public class TwoHashSetPrblm {
//  public static void main(String[] args) {
//  HashSet<Integer> s1 = new HashSet<>();
// s1.add(1);
// s1.add(5);
//  s1.add(3);
//  HashSet<Integer> s2 = new HashSet<>();
//  s2.add(4);
//  s2.add(5);
//  s2.add(6);
//   System.out.println(s1.containsAll(s2)); // output: false becouse s1 does not contains all the elements of s2
//  }
//}