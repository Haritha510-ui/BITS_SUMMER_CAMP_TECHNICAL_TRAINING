package Day9;

import java.util.Scanner;

public class PrintHello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times you want to print 'Hello': ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Hello");
        }
        sc.close();
    }
}
