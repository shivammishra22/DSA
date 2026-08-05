// Java program to implement a priority queue 
class PriorityQueue {
	private class Node {
		int data;
		int priority;
		Node next;
		Node(int data, int priority) {
			this.data = data;
			this.priority = priority;
			this.next = null;
		}
	}
	private Node front, rear;
	private int size;
	public int getSize() {
		return size;
	}
	// function to insert an element in queue according to priority
	public void enqueue(int data, int priority) {
		Node newNode = new Node(data, priority);
		size++;
		if (front == null) {
			front = rear = newNode;
		} else {
			if (newNode.priority < front.priority) {
				newNode.next = front;
				front = newNode;
			} else if (newNode.priority >= rear.priority) {
				rear.next = newNode;
				rear = newNode;
			} else {
				Node currentNode = front;
				while (currentNode != rear) { //while (currentNode.next != null) {
					if (  newNode.priority < currentNode.next.priority) {
						newNode.next = currentNode.next;
						currentNode.next = newNode;
						break;
					}
					currentNode = currentNode.next;
				}
			}
		}
		System.out.println(data + " is added to Queue");
	}
	// function to delete an element from the front of the queue
	public void dequeue() {
		// if queue is empty
		if (front == null) {
			System.out.println("Queue is empty");
			return;
		}
		int value = front.data;
		front = front.next;
		size--;
		System.out.println(value + " is removed from Queue");
	}
	// function to delete an element from the queue according to priority
	public void dequeue(int priority) {
		// if queue is empty
		if (front == null) {
			System.out.println("Queue is empty");
			return;
		}
		if (priority == front.priority) {
			if(front==rear) {
				front=rear=null;
				return;
			}
			front = front.next;
			return;
		}
		Node currentNode = front;
		boolean flag=true;
		while (currentNode.next != null) {
			if (priority == currentNode.next.priority) {
				flag=false;
				break;
			}
			currentNode = currentNode.next;
		} 
		if(flag) {
			System.out.println("Priority does not exist!");
		}else {
			if (currentNode.next == rear) {
				rear = currentNode;
			}
			currentNode.next=currentNode.next.next;
			System.out.println("Removed from Queue");
		}

	}
	// print queue elements
	public void traverse() {
		if (front == null) {
			System.out.println("Queue is empty");
			return;
		}
		// traverse queue elements
		System.out.println("Queue Elements are:");
		Node currentNode = front;
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		} 
	}
}

public class QueuePriority {
	public static void main(String[] args) {
		// Create a queue
		PriorityQueue q = new PriorityQueue();

		// print Queue elements
		q.traverse();

		// inserting elements in the queue
		q.enqueue(10, 1);
		q.enqueue(20, 5);
		q.enqueue(30, 2);
		q.enqueue(40, 8);
		q.enqueue(50, 9);
		q.enqueue(60, 3);
		q.enqueue(70, 3);
		q.enqueue(80, 1);
		q.enqueue(90, 9);

		// print Queue elements
		q.traverse();

		// removing elements from the queue
		q.dequeue();
		q.dequeue(8);

		System.out.println("after two node deletion");

		// print Queue elements
		q.traverse();
	}
}
