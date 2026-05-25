package Day7;

import java.util.Scanner;

public class NullPointerDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            String s = null;

            System.out.println("Length = " + s.length());

        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception Handled");
        }

        sc.close();
    }
}
