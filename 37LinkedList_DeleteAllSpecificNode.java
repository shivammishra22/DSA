//Creating Linked List: Deletion from Specific Node Value of Linked List

class MyLinkedListtttt {
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
	void deleteAllSpecificNode(int data) {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		Node c = head;
		boolean flag=false;
		while (c != null) {
			if (head.data == data) {
				head = head.next;
				c = head;
				flag=true;
			}
			else if (c.next!=null && c.next.data == data) {
				c.next = c.next.next;
				if (c.next == null) {
					tail = c;
					break;
				}
				flag=true;
			}
			else {
				c = c.next;
			}
		}
		if (!flag) {
			System.out.println("Data not found.");
		}
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

public class LinkedList_DeleteAllSpecificNode {

	public static void main(String[] args) {
		MyLinkedListtttt list = new MyLinkedListtttt();
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(8);
		list.addNodeAtEnd(2);
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(7);
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(5);
		list.printList();
		list.deleteAllSpecificNode(5);
		list.printList();
	}

}
