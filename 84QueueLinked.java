// Java program to implement a queue using an Linked
class LinkedQueue {
	private class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
    private Node front, rear;
    private int size;
 
    public int getSize() {
    	return size;
    }
    public void enqueue(int data){
       Node newNode=new Node(data);
       if(front==null) {
    	   front=rear=newNode;
       }else {
    	   rear.next=newNode;
    	   rear=newNode;
       }
       System.out.println(data+" Added Successfully!");
       size++;
    }
    public void dequeue() {
        if(front==null) {
        	System.out.println("Queue is Empty!");
        	return;
        } 
        int v=front.data;
        System.out.println(v+" Removed Successfully!");
        if(front==rear){
        	front=rear=null;
        }else {
        	front=front.next;
        }
        size--;
    }
    public void traverse(){
    	if(front==null) {
        	System.out.println("Queue is Empty!");
        	return;
        }
    	Node currentNode=front;
    	while(currentNode!=null) {
    		System.out.println(currentNode.data);
    		currentNode=currentNode.next;
    	}
    }
}

public class QueueLinked {
	public static void main(String[] args) {
		// Create a queue
		LinkedQueue q = new LinkedQueue();

        System.out.println("No of elements: "+q.getSize());
        // print Queue elements
        q.traverse();
 
        // inserting elements in the queue
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
 
        System.out.println("No of elements: "+q.getSize());
        // print Queue elements
        q.traverse();
        
        // removing elements from the queue
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();

        System.out.println("No of elements: "+q.getSize());
        // print Queue elements
        q.traverse();
	}
}
