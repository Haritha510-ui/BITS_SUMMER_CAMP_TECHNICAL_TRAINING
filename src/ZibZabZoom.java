import java.util.Scanner;

public class ZibZabZoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if(num % 3 == 0 && num % 5 == 0){
            System.out.println("Zoom");
        }
           else if(num % 3 == 0){
            System.out.println("Zib");
           }
           else if(num %  5 == 0){
            System.out.println("Zab");
           }
           else{
            System.out.println("Default");
           }
    }
    
}
