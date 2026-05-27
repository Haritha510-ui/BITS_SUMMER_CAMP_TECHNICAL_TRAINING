package Day9;

public class StackIsFull {
    int arr[] = new int[5];
    int top = 4;
    boolean isFull() {
        if (top == arr.length - 1) {
            System.out.println("Stack is full");
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        StackIsFull s = new StackIsFull();
        System.out.println(s.isFull());
    }
}
