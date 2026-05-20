package day2.Arrays;

import java.util.Scanner;

public class Implementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 5;
        int[] arr = new int[size];
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

        int[] arr3 = {1,2,3,4};
        System.out.println("Enter a elements for first array: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter a elements for second array: ");
        for(int i = 0; i < size; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i < size; i++){
            arr2[i] = arr[i] + arr1[i];
        }
        System.out.println("Sum of arrays: ");
        for(int i = 0; i < size; i++){
            System.out.print(arr2[i] + " ");
        }
        System.out.println("\n\nElements in arr3: ");
        for(int i = 0; i < arr3.length; i++){
           System.out.print(arr[3] + " ");
        }
        sc.close();
    }
}
