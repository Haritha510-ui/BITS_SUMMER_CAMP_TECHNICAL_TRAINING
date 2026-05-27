package Day9;

public class SearchElementInStack {
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
    boolean search(int data) {
        for (int i = top; i >= 0; i--) {
            if (arr[i] == data) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        SearchElementInStack obj = new SearchElementInStack();
        obj.push(90);
        obj.push(80);
        obj.push(70);
        obj.push(60);
        obj.push(50);
        System.out.println(obj.search(70));
        System.out.println(obj.search(100));
    }
}
