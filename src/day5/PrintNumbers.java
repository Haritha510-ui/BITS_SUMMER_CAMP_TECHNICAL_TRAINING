package day5;

public class PrintNumbers {
    
   public static void func(int n) {
    
    // base call
    if(n == 0) return;

    // recursive call
    func(n-1);
    System.out.println(n + " ");
 }

 public static void main(String[] args) {
    func(5);
 }
}

