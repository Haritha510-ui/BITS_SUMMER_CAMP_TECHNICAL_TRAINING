import java.util.Scanner;

public class SubjectMarks {
    public static void main(String[] args) {
        int m1,m2,m3,m4,m5;
        Scanner sc = new Scanner(System.in);
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        m4 = sc.nextInt();
        m5 = sc.nextInt();

        int sum = m1 + m2 + m3 + m4 + m5;
        int percentage = sum / 5;
        System.out.println(percentage);
        if(percentage > 90 && percentage <= 100){
            System.out.println("Grade A");
        }
        if(percentage > 80 && percentage <= 90){
            System.out.println("Grade B");
        }
        if(percentage > 70 && percentage <= 80){
            System.out.println("Grade C");
        }else{
            System.out.println("Grade D");
        }
    }
    
}
