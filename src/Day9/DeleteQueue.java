package Day9;

public class DeleteQueue {
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
    void dequeue() {
        if(front == -1 || front > rear) {
            System.out.println("Queue is underflow");
            return;
        }
        System.out.println(arr[front] + " ->deleted from queue");
        front++;
    }
    public static void main(String[] args) {
        DeleteQueue obj = new DeleteQueue();
        obj.enqueue(90);
        obj.enqueue(80);
        obj.enqueue(70);
        obj.enqueue(60);
        obj.enqueue(50);
        obj.dequeue();
        obj.dequeue();
    }
}
