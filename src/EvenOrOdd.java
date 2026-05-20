import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        if(a%2==0)
            System.out.println("it is a even number");
        else {
            System.out.println("it is a odd number");
            sc.close();
        }
    }
    
}
