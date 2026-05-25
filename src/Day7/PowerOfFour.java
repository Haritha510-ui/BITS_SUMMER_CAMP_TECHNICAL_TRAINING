package Day7;

import java.util.Scanner;

public class PowerOfFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < 5; i++) {
            int t = sc.nextInt();
            if((t & (n - 1)) == 0) {
                System.out.println("Power of 4");
            } else {
                System.out.println("Not a power of 4");
            }
        }
        sc.close();
    }
}
