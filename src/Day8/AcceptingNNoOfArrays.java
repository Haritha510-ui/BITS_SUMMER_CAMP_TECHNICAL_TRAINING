package Day8;

import java.util.LinkedList;
import java.util.Scanner;

public class AcceptingNNoOfArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String k = sc.nextLine();
        int n = sc.nextInt();

        LinkedList<String> list = new LinkedList<>();

        for(int i = 0; i < n; i++) {
            String val = sc.next();
            list.add(val);
        }

        System.out.println(list.contains(k));

        int c = 0;

        for(String d : list) {
            if(d.equals(k)) {
                c++;
            }
        }

        System.out.println(c);
        sc.close();
    }
    
}