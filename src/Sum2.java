import java.util.Scanner;

public class Sum2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,sum;

        System.out.println("Enter first number: ");
        a = sc.nextInt();
        System.out.println("Enter second number: ");
        b = sc.nextInt();
        sum = a + b;
        System.out.println("sum of two numbers: "+ sum);
        sc.close();

    }


    
}
