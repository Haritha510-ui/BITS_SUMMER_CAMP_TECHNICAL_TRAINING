package Day8;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> emd = new ArrayList<>();
        emd.add("Hari");
        emd.add("Thiru");
        emd.add("Nikki");
        LinkedHashSet<String> lhs = new LinkedHashSet<>(emd);
        System.out.println(lhs);
        sc.close();
    }
}
