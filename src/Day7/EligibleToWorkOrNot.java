package Day7;

public class EligibleToWorkOrNot {
    public static void main(String[] args) {
        int n = 20;
        try {
            if(n > 18) {
                 throw new ArithmeticException(" > 18");
            }
            System.out.println("You are eligible to work");
        } catch(Exception e) {
            System.out.println("Not eligible to work");
        }
    }
}
