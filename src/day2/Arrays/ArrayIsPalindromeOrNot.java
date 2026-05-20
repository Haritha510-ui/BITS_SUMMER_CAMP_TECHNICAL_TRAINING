package day2.Arrays;

import java.util.Scanner;

public class ArrayIsPalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,2,1};
        int start = 0;
        int end = arr.length - 1;
        boolean palindrome = true;
        while(start < end){
            if(arr[start] != arr[end]){
                palindrome = false;
                break;
            }
            start++;
            end--;
        } 
        if(palindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
        sc.close();
    }
}
