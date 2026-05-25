package Day7;

import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int arr[] = new int[5];
        try {
            for(int i = 0; i < n; i++){
                arr[i] = 2;
                System.out.println(arr[i]);
            }
        } catch(Exception e) {
            System.out.println("Array is full");
        }
        sc.close();
    }
}
