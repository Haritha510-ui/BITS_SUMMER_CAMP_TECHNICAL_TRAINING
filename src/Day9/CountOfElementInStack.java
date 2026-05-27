package Day9;

public class CountOfElementInStack {
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
    int count() {
        return top + 1;
    }
    public static void main(String[] args) {
        CountOfElementInStack obj = new CountOfElementInStack();
        obj.push(90);
        obj.push(80);
        obj.push(70);
        obj.push(60);
        obj.push(50);
        System.out.println("Count of element in stack: " + obj.count());
    }
}
