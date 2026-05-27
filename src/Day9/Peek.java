package Day9;

public class Peek {
    int arr[] = new int[5];
    int top = -1;
    void push(int data) {
        if(top == arr.length - 1) {
            System.out.println("Stack is overflow");
            return;
        }
        ++top;
        arr[top] = data;
        System.out.println(arr[top] + " ->inserted in stack");
    }
    void peek() {
        if(top == -1) {
            System.out.println("No values in stack to peek");
            return;
        }
        System.out.println(arr[top] + " ->is peeked from stack");
    }
    public static void main(String[] args) {
        Peek obj = new Peek();
        obj.push(90);
        obj.push(80);
        obj.push(70);
        obj.push(60);
        obj.push(50);
        obj.peek();
    }
}
