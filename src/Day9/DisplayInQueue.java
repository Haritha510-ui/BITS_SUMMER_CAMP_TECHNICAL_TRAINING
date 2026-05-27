package Day9;

public class DisplayInQueue {
    int front = -1;
    int rear = -1;
    int arr[] = new int[5];
    void enqueue(int data) {
        if(rear == arr.length - 1) {
            System.out.println("Queue is overflow");
            return;
        }
        if(front == -1) {
            front = 0;
        }
        rear++;
        arr[rear] = data;
        System.out.println(arr[rear] + " ->inserted in queue");
    }
    void display() {
        if(front == -1) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Elements in queue: ");
        for(int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DisplayInQueue obj = new DisplayInQueue();
        obj.enqueue(90);
        obj.enqueue(80);
        obj.enqueue(70);
        obj.enqueue(60);
        obj.enqueue(50);
        obj.display();
    }
}
