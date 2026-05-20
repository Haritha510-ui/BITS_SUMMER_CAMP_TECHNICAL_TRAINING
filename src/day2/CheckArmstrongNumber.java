package day2;

import java.util.Scanner;

public class CheckArmstrongNumber {
    public static boolean solution(int num){
     
        // step 1:get the count of digits
        int temp = num;
        int count = 0;

         while (temp != 0) {
            count++;
            temp = temp / 10;
         }

        // step 2: calculate  the consicutive sum of all digits with j
        temp = num;
        double result = 0;
        while (temp != 0) {
            int digit = temp % 10;
            result = result + Math.pow(digit, count);
            temp /= 10; 
        } 

        // step 3: checking for equalent of resultant number
        System.out.println(result + " " + num);
         return result == num;

        }
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();
                if (solution(num)) {
                    System.out.println("this is a armstrong number");
                }else{
                    System.out.println("this is not a armstrong number");
                }
                sc.close();
            }

    }
