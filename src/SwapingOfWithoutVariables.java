import java.util.Scanner;

public class SwapingOfWithoutVariables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 10;
        int b = 20;
        System.out.println("Before swaping: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
         System.out.println("After swaping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
    
}
