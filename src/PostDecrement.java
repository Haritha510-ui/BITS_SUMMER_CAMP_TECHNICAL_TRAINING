import java.util.Scanner;

public class PostDecrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 10;
        int b = 5,c;
        c = a-- + b--;
         System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        sc.close();
    }
}
