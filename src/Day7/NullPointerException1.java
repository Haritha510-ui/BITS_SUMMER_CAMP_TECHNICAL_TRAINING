package Day7;

import java.util.Scanner;

public class NullPointerException1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String s = null;
            String s1 = "Haritha";
            if(s1.equals(s)) {
                System.out.println("Equal");
            }
            System.out.println(9/0);
        } catch(NullPointerException e) {
            System.out.println("Null");
        } catch(ArithmeticException e) {
            System.out.println("AE");
        }
        sc.close();
    }
}
