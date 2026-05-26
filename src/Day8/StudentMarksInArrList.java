package Day8;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMarksInArrList {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
         int t = sc.nextInt();
         for(int j = 0; j < t; j++) {
         ArrayList<Integer> arr = new ArrayList<>();
         for(int  i = 0; i < 5; i++){
            int Submarks = sc.nextInt();
            arr.add(Submarks);
             }int sum = 0;
             for(int c : arr) {
                sum += c;
             }
             double avg = (double)sum/5;
            
             System.out.println(j+1 + " st Student average " + avg);
               
         }
         sc.close();
    }
}
