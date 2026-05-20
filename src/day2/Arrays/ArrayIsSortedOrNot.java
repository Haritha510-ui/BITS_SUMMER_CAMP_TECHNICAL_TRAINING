package day2.Arrays;

import java.util.Scanner;

public class ArrayIsSortedOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,30,40,50};
        boolean sorted = true;
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i + 1]){
                sorted = false;
                break;
            }
        }
        if(sorted)
            System.out.println("Array is sorted");
        else
        System.out.println("Array is not sorted");
    sc.close();
    }
}
