package Day9;

public class SearchInQueue {
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
    boolean search(int key) {
        for (int i = front; i <= rear; i++) {
            if(arr[i] == key) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        SearchInQueue obj = new SearchInQueue();
        obj.enqueue(90);
        obj.enqueue(80);
        obj.enqueue(70);
        obj.enqueue(60);
        obj.enqueue(50);
        System.out.println(obj.search(70));
    }
}
