package day2;

import java.util.Scanner;

public class Decrement {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 3;
        int b = 2,c;
        c = --a + --b;
        System.out.println("a " + a);
        System.out.println("b " + b);
        System.out.println("c " + c);
        sc.close();
    }
}

