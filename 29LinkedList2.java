//Creating Linked List: Insertion at Beginning

class MyLinkedList2 {
	private Node head = null;
	private Node tail = null;

	private class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	public void addNodeAtBeginning(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=tail=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
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

public class LinkedList2 {

	public static void main(String[] args) {
		MyLinkedList2 list = new MyLinkedList2();
		list.printList();
		list.addNodeAtBeginning(5);
		list.addNodeAtBeginning(9);
		list.addNodeAtBeginning(23);
		list.addNodeAtBeginning(56);
		list.addNodeAtBeginning(3);
		list.printList();
	}

}
