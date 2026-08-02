//Creating Linked List: Deletion from beginning of Linked List

class MyLinkedList5 {
	private Node head = null;
	private Node tail = null;

	private class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void addNodeAtEnd(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void deleteNodeFromBeginning() {
		if (head == null) {
			System.out.println("Nothing to delete.");
		} else if (head == tail) {
			head = tail = null;
		} else {
			head = head.next;
		}
	}

	public void printList() {
		if (head == null) {
			System.out.println("Linked List is empty");
		} else {
			System.out.println("Nodes of Linked list: ");
			Node currentNode = head;
			while (currentNode != null) {
				System.out.print(currentNode.data + " ");
				currentNode = currentNode.next;
			}
			System.out.println();
		}
	}
}

public class LinkedList5 {

	public static void main(String[] args) {
		MyLinkedList5 list = new MyLinkedList5();
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(8);
		list.addNodeAtEnd(2);
		list.addNodeAtEnd(15);
		list.printList();
		list.deleteNodeFromBeginning();
		list.printList();
	}

}
