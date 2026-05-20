package day2.Arrays;

import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            System.out.print("insert the element at position " + i);
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < size; i++){
           sum = sum + arr[i];
        }
        System.out.println("Sum of array elements:"+sum);
        sc.close();
    }
}
