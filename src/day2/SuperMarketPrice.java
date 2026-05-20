package day2;

import java.util.Scanner;

public class SuperMarketPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int product = 1;
        while (n > 0) {
            int digit = n % 10;                    //input as : 5244 ---- 5*2*4*4 = 160
            product = product * digit;             //output as : 160
            n = n / 10;
        }
        System.out.println(product);
        sc.close();
    }
}
