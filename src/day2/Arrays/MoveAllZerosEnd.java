package day2.Arrays;

import java.util.Scanner;

public class MoveAllZerosEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,0,2,0,10,0,66,0};
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[index] = arr[i];
                index++;
            }
        }
        while(index < arr.length){
            arr[index] = 0;
            index++;
        }
        for(int i : arr){
            System.out.print(i + " ");

        }
        sc.close();
    }
}
