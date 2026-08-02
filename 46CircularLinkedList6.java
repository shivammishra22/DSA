//Circular Linked List Operation: Deletion at Specific Node Value


class MyCircularLinkedList6 {
	public Node head = null;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void addNodeAtEnd(int data) {
		Node newNode = new Node(data);

		// Checks if the list is empty
		if (head == null) {
			head = newNode;
			newNode.next = head;
		} else {
			// currentNode will point to head
			Node currentNode = head;
			while (currentNode.next != head) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
			newNode.next = head;
		}
	}

	public void deleteNodeAtSpecificNodeValue(int locationValue) {
		// Checks if the list is empty
		if (head == null) {
			System.out.println("Nothing to delete.");
		} else if (head.data == locationValue && head.next == head) {
			head = null;
		} else if (head.data == locationValue ) {
			Node currentNode = head.next;
			while(currentNode.next != head) { 
				currentNode = currentNode.next;
            }
			head = head.next;
			currentNode.next=head;
		} else {
			boolean flag=false;
			Node currentNode = head;
			while(currentNode.next != head) {
				if (currentNode.next.data == locationValue) {
					flag=true;
					break;
				}
				currentNode = currentNode.next;
			}
			if (flag) {
				currentNode.next = currentNode.next.next;
			} else {
				System.out.println("Location Value does not exist.");
			}
		}
	}
	
	public void deleteAllSpecificNodeValue(int locationValue) {
		//Your Logic
	}

	public void printList() {
		// currentNode will point to head
		Node currentNode = head;

		if (head == null) {
			System.out.println("Singly Circular Linked List is empty!");
		} else {
			System.out.println("Nodes of Singly Circular Linked List: ");
			do {
				System.out.print(currentNode.data + " ");
				currentNode = currentNode.next;
			} while (currentNode != head);
			System.out.println();
		}
	}
}

public class CircularLinkedList6 {

	public static void main(String[] args) {
		MyCircularLinkedList6 list = new MyCircularLinkedList6();
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(2);
		list.addNodeAtEnd(15);
		list.addNodeAtEnd(8);
		list.addNodeAtEnd(2);
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(32);
		list.printList();
		list.deleteNodeAtSpecificNodeValue(5);
		list.deleteAllSpecificNodeValue(5);
		list.printList();
	}

}
