//Circular Linked List Operation: Insertion after&before Specific Node Value of Linked List

class MyCircularLinkedList3 {
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

	public void addNodeAfterSpecificNodeValue(int locationValue, int data) {
		if (head == null) {
			System.out.println("Singly Circular Linked List is empty!");
		} else {
			Node currentNode = head;
			boolean flag=false;
			do {
				if (currentNode.data == locationValue) {
					flag=true;
					break;
				}
				currentNode = currentNode.next;
			} while (currentNode != head);
			if (flag) {
				Node newNode = new Node(data);
				newNode.next = currentNode.next;
				currentNode.next = newNode;
			} else {
				System.out.println("Location Value does not exist.");
			}
		}
	}
	public void addNodeBeforeSpecificNodeValue(int locationValue, int data) {
		//your Logic
		if (head == null) {
			System.out.println("Singly Circular Linked List is empty!");
		} else if(locationValue==head.data){
			Node newNode = new Node(data);
			Node currentNode = head;
			while (currentNode.next != head) {
				currentNode = currentNode.next;
			}
			newNode.next = head;
			currentNode.next = newNode;
			head = newNode;
		}else {
			Node currentNode = head;
			boolean flag=false;
			do {
				if (currentNode.next.data == locationValue) {
					flag=true;
					break;
				}
				currentNode = currentNode.next;
			} while (currentNode != head);
			if (flag) {
				Node newNode = new Node(data);
				newNode.next = currentNode.next;
				currentNode.next = newNode;
			} else {
				System.out.println("Location Value does not exist.");
			}
		}
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

public class CircularLinkedList3 {

	public static void main(String[] args) {
		MyCircularLinkedList3 list = new MyCircularLinkedList3();
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(9);
		list.addNodeAtEnd(23);
		list.addNodeAtEnd(56);
		list.addNodeAfterSpecificNodeValue(9, 3);
		list.addNodeBeforeSpecificNodeValue(9, 3);
		list.printList();
	}

}
