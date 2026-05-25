package day3.day4Test;

public class ReverseOfString {
    public static void main(String[] args) {
        String str = "HelloWorld";
        String rev = " ";
        for(int i = str.length() - 1; i >= 0; i--){
            rev = rev + str.charAt(i);

        }
        System.out.println("Reversed String = " + rev);
    }
}
