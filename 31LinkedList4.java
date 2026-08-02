//Creating Linked List: Deletion from end of Linked List

class MyLinkedList4 {
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

	public void deleteNodeFromEnd() {
		if (head == null) {
			System.out.println("Linked List is empty");
			return;
		} 
		if(head==tail) {
			head=tail=null;
			return;
		}
		Node currentNode=head;
		while(currentNode.next.next!=null) {
			currentNode=currentNode.next;
		}
		currentNode.next=null;
		tail=currentNode;
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

public class LinkedList4 {

	public static void main(String[] args) {
		MyLinkedList4 list = new MyLinkedList4();
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(65);
		list.addNodeAtEnd(3);
		list.addNodeAtEnd(7);
		list.addNodeAtEnd(9);
		list.printList();
		list.deleteNodeFromEnd();
		list.printList();
	}

}
