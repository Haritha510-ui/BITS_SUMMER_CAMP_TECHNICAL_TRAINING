package day2.Arrays;

import java.util.Scanner;

public class BinarySearchUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,30,40,50};
        int key = 30;
        int low = 0, high = arr.length - 1;
        boolean found = false;
        while (low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] == key){
                found = true;
                break;
            }
            else if(arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        if(found)
            System.out.println("Element found");
        else
            System.out.println("Element is not found");
        sc.close();
    }
}
