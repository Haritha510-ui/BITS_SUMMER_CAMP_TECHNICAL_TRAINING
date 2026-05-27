package Day9;

public class QueueArray {
    int queue[] = new int[5];
    int front = -1;
    int rear = -1;

    // Enqueue operation
    public void enqueue(int data){
        if(rear == queue.length - 1){
            System.out.println("Queue is Overflow");
        } else {
            if(front == -1){
                front = 0;
            }
            rear++;
            queue[rear] = data;
        }
    }

    // Dequeue operation
    public void dequeue(){
        if(front == -1 || front > rear){
            System.out.println("Queue is Underflow");
        } else {
            front++;
        }
    }

    // peek operation
    public void peek(){
        if(front == -1 || front > rear){
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front element is: " + queue[front]);
        }
    }

    // isEmpty operation
    public void isEmpty(){
        if(front == -1 || front > rear){
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue is not empty");
        }
    }

    //display operation
    public void display(){
        if(front == -1 || front > rear){
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue elements are: ");
            for(int i = front; i <= rear; i++){
                System.out.print(queue[i] + " ");
        }
    }
}
public static void main(String[] args) {
    QueueArray q = new QueueArray();
    q.enqueue(1);
    q.enqueue(2);
    q.enqueue(3);
    q.enqueue(4);
    q.enqueue(5);
    q.display();
    q.dequeue();
    q.dequeue();
    q.peek();
    q.isEmpty();
}
}
