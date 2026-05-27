package Day9;

public class PushInStack {
    int arr[] = new int[5];
    int top = -1;
    void push(int data) {
    // stack is full or not
        if(top == arr.length - 1) {
            System.out.println("Stack is overflow");
            return;
        }
        ++top;
        arr[top] = data;
        System.out.println(arr[top] + " ->inserted in stack");
    }
    public static void main(String[] args) {
        PushInStack obj = new PushInStack();
        obj.push(90);
        obj.push(80);
        obj.push(70);
        obj.push(60);
        obj.push(50);
    }
}
