// Java program to implement a queue using an array
class ArrayQueue {
    private int front, rear, capacity;
    private int queue[];
 
    public ArrayQueue(int capacity){
        this.capacity = capacity;
        queue = new int[capacity];
    }
    public void enqueue(int data){
        if(rear==capacity) {
        	System.out.println("Queue is Full!");
        	return;
        }
        queue[rear]=data;
        rear++;
        System.out.println(data+ " added successfully!");
    }
    public void dequeue(){
        if(front==rear) {
        	System.out.println("Queue is Empty!");
        	return;
        }
        int v=queue[front];
        System.out.println(v+" is removed successfully!");
        front++;
    }
    public void traverse() {
    	if(front==rear) {
        	System.out.println("Queue is Empty!");
        	return;
        }
    	for(int x=front;x<rear;x++) {
    		System.out.println(queue[x]);
    	}
    }
    public int getSize() {
    	return rear-front;
    }
}
public class QueueArray {
	public static void main(String[] args) {
		// Create a queue of capacity 4
		ArrayQueue q = new ArrayQueue(4);
		System.out.println(q.getSize());
        // print Queue elements
        q.traverse();
        // inserting elements in the queue
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);//Queue is full
		System.out.println(q.getSize());
        // print Queue elements
        q.traverse();
        // removing elements from the queue
        q.dequeue();
        q.dequeue();
        System.out.println("after two node deletion");
        q.enqueue(50);//Queue is full
		System.out.println(q.getSize());
        // print Queue elements
        q.traverse();
	}
}
