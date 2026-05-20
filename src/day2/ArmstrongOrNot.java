package day2;

import java.util.Scanner;

public class ArmstrongOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int temp = num;
        int  sum = 0;
        while(num > 0){
            int rem = num % 10;
            sum = sum + (rem * rem * rem);
            num = num / 10;
        }
        if(temp == sum){
            System.out.println("Armstrong Number");
        } else {
         System.out.println("Not an Armstrong Number");
         sc.close();
        }
        }
    }
