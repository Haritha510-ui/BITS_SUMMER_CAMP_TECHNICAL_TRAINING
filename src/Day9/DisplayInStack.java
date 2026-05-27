package Day9;

public class DisplayInStack {
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
    void display() {
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        DisplayInStack obj = new DisplayInStack();
        obj.push(90);
        obj.push(80);
        obj.push(70);
        obj.push(60);
        obj.push(50);
        obj.display();
    }
}
