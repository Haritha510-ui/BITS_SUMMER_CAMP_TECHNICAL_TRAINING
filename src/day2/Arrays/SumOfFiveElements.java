package day2.Arrays;

import java.util.Scanner;

public class SumOfFiveElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum = " + sum);
        sc.close();
    }
}
