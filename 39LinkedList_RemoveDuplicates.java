//Creating Linked List: Deletion Repeated nodes from Specific Node Value of Linked List

class MyLinkedListtt {
	public Node head = null;
	public Node tail = null;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void addNodeAtEnd(int data) {
		// Create a new node
		Node newNode = new Node(data);
		if (head == null) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	public void removeDuplicates() {
		// Your Logic
	}

	public void printList() {
		// currentNode will point to head
		Node currentNode = head;

		if (head == null) {
			System.out.println("Linked List is empty");
		} else {
			System.out.println("Nodes of singly linked list: ");
			while (currentNode != null) {
				System.out.print(currentNode.data + " ");
				currentNode = currentNode.next;
			}
			System.out.println();
		}
	}
}

public class LinkedList_RemoveDuplicates {

	public static void main(String[] args) {
		MyLinkedListtt list = new MyLinkedListtt();
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(8);
		list.addNodeAtEnd(2);
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(7);
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(2);
		list.addNodeAtEnd(5);
		list.printList();
		list.removeDuplicates();
		list.printList();
	}

}
