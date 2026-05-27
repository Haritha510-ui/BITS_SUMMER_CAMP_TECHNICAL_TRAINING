package Day9;

public class CountInQueue {
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
    int count() {
        if(front == -1) {
            return 0;
        }
        return rear - front + 1;
    }
    public static void main(String[] args) {
        CountInQueue obj = new CountInQueue();
        obj.enqueue(90);
        obj.enqueue(80);
        obj.enqueue(70);
        obj.enqueue(60);
        obj.enqueue(50);
        System.out.println("Count of element in queue: " + obj.count());
    }
}
