package day2.Arrays;

import java.util.Scanner;

public class RotateLeftByOneElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        int first = arr[0];
        for(int i = 0; i < arr.length - 1; i++){
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;
        for(int i : arr){
            System.out.print(i + " ");
        }
        sc.close();
    }
}
