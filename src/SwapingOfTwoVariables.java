import java.util.Scanner;

public class SwapingOfTwoVariables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 10;
        int b = 20;
        int temp;
        System.out.println("Before swaping: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        temp = a;
        a = b;
        b = temp;
        System.out.println("After swaping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    
}
