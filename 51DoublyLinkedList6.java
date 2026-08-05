//Doubly Linked List Operation:  Deletion at Specific Node Value

class MyDoublyLinkedList6 {
	private class Node{
		int data;
		Node next;
		Node previous;
		public Node(int data) {    
            this.data = data;    
            this.next = null;  
            this.previous = null;     
        }
	} 
	private Node head;    
	private Node tail; 
	
	public void addNodeAtEnd(int data) {
		// Create a new node
		Node newNode = new Node(data);
		// Checks if the list is empty
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			// newNode will be added after tail
			tail.next = newNode;
			newNode.previous = tail;
			// newNode will become new tail of the list
			tail = newNode;
		}
	}

	public void deleteNodeAtSpecificNodeValue(int locationValue) {
		// Checks if the list is empty
		if (head == null) {
			System.out.println("list is empty");
			return;
		}
		if(head.data==locationValue && head==tail){
			head=tail=null;
		}else {
			Node currentNode=head;
			boolean flag=false;
			while(currentNode!=null) {
				if(currentNode.data==locationValue) {
					flag=true;
					break;
				}
				currentNode=currentNode.next;
			}
			if(flag) {
				if(currentNode==head) {
					currentNode.next.previous=currentNode.previous;
					head=currentNode.next;
				}else if(currentNode==tail) {
					currentNode.previous.next=currentNode.next;
					tail=currentNode.previous;
				}else {
					currentNode.next.previous=currentNode.previous;
					currentNode.previous.next=currentNode.next;
				}
			}else {
				System.out.println("Location Value does not Exist!");
			}
		}
	}
	public void deleteAllNodeAtSpecificNodeValue(int locationValue) {
		//Your Logic
	}

	public void printListForward() {
		if (head == null) {
			System.out.println("Linked List is empty");
		} else {
			System.out.println("Nodes of Doubly linked list: ");

			// currentNode will point to head
			Node currentNode = head;
			while (currentNode != null) {
				System.out.print(currentNode.data + " ");
				currentNode = currentNode.next;
			}
			System.out.println();
		}
	}

	public void printListBackward() {

		if (head == null) {
			System.out.println("Linked List is empty");
		} else {
			System.out.println("Nodes of Doubly linked list: ");

			// currentNode will point to tail
			Node currentNode = tail;
			while (currentNode != null) {
				System.out.print(currentNode.data + " ");
				currentNode = currentNode.previous;
			}
			System.out.println();
		}
	}
}

public class DoublyLinkedList6 {

	public static void main(String[] args) {
		MyDoublyLinkedList6 list = new MyDoublyLinkedList6();
		list.addNodeAtEnd(45);
		list.addNodeAtEnd(9);
		list.addNodeAtEnd(55);
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(15);

		list.printListForward();
		list.deleteNodeAtSpecificNodeValue(5);
		list.deleteAllNodeAtSpecificNodeValue(5);
		list.printListForward();
	}

}
