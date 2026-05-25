package Day7;

import java.util.Scanner;

public class StringNumberCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = 5;

        for (int i = 0; i < t; i++) {

            String s = sc.nextLine();
            boolean found = false;

            for (int j = 0; j < s.length(); j++) {

                if (Character.isDigit(s.charAt(j))) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("Contains Number");
            } else {
                System.out.println("No Number");
            }
        }

        sc.close();
    }
}