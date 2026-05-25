package Day7;

import java.util.Scanner;

public class UniqueValueOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
           arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            s = s ^ arr[i];
        }
        System.out.println(s);
        sc.close();
    }

}