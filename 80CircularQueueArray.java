// Java program to implement a circular queue using an array
class CircularQueue {
    private int front, rear, capacity;
    private int queue[];
    private int size;
 
    public CircularQueue(int capacity){
        this.capacity = capacity;
        queue = new int[capacity];
    }
 
    public void enqueue(int data){
        // check queue is full or not
        if (size==capacity) {
            System.out.println("Queue is full");
            return;
        }
        // insert element at the rear
        if(rear==capacity) {
        	rear=0;
        }
        queue[rear] = data;
        rear++;
        size++;
        System.out.println(data+" is added in Queue");
    }
    // function to delete an element from the front of the queue
    public void dequeue()
    {
        // if queue is empty
        if (size==0) {
            System.out.println("Queue is empty");
            return;
        }
        if(front==capacity) {
        	front=0;
        }
        int value = queue[front];
        front++;
        size--;
        System.out.println(value+" is removed from Queue");
    }
    // print queue elements
    public void traverse()
    {
        if (size==0) {
            System.out.println("Queue is empty");
            return;
        }
        // traverse queue elements
        System.out.println("Queue Elements are:");
        if(front<rear) {
	        for (int i = front; i < rear; i++) {
	            System.out.println(queue[i]);
	        }
        }else {
        		for (int i = front; i < capacity; i++) {
		            System.out.println(queue[i]);
		        }
        		for (int i = 0; i < rear; i++) {
    	            System.out.println(queue[i]);
    	        }
        }
    }
}

public class CircularQueueArray {
	public static void main(String[] args) {
		// Create a queue of capacity 4
		CircularQueue q = new CircularQueue(4);
 
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        
        q.traverse();
       
        q.dequeue();
        q.dequeue();
        
        q.traverse();
        
        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(70);
        
        q.traverse();
        
        q.dequeue();
        q.traverse();
 
	}
}
