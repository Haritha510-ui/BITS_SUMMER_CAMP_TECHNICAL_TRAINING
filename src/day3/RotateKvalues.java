package day3;

import java.util.Arrays;

public class RotateKvalues {

    // TC: o(n)
    public static void solution(int[] arr){
        int size = arr.length;


       // step1: preserve the k values k =1
       int temp = arr[0];

      //step2: move all the elements to i-1th position
      for(int i = 1; i < size; i++){
        arr[i-1] = arr[i];
      }

      //step3: put the preserved elements at the end
      arr[size-1] = temp;
    }


    public static void main(String[] args) {
        int[] arr = {-1,0,2,4,8,10};

        solution(arr);

        System.out.println(Arrays.toString(arr));
        
    }
}
