package Day9;

public class PeekOperationInStack {
    int top;
    int capacity;
    int stack[];

    PeekOperationInStack(int size){
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x){
        if(top == capacity - 1){
            System.out.println("Stack overflow");
            return;
        }
        stack[++top] = x;
    }

    public int pop(){
        if(top == -1){
            System.out.println("Stack underflow");
            return -1;
        }
        return stack[top--];
    }

    public int peek(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    public static void main(String[] args) {
        PeekOperationInStack s = new PeekOperationInStack(5);
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("Top element is: " + s.peek());
        s.pop();
        System.out.println("Top element is: " + s.peek());
    }
}
