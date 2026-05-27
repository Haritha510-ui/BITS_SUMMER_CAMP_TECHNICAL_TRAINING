package Day9;

public class Pop {
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
    void pop() {
        if(top == -1) {
            System.out.println("Stack is underflow");
            return;
        }
        System.out.println(arr[top] + " ->deleted from stack");
        --top;
    }
    public static void main(String[] args) {
        Pop obj = new Pop();
        obj.push(90);
        obj.push(80);
        obj.push(70);
        obj.push(60);
        obj.push(50);
        obj.pop();
        obj.pop();
    }
}
