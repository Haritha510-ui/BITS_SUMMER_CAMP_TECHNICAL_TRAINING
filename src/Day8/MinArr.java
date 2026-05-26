package Day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinArr {
    public class AcceptTNoOfTestCases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j = 0; j < t; j++){
            int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int m = sc.nextInt();
            arr.add(m);
            
        }
        System.out.println(Collections.min(arr));
        
    }
    sc.close();
  }
}
}
