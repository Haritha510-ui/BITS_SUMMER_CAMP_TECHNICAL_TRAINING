package day2.Arrays;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,3,4,5,6,7,8};
         int min = arr[0];
         int max = arr[0];
         for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
                
            }
         }
         System.out.println("Min : " + min + " Max : " + max);
         sc.close();
    }
}
