//Creating Linked List: Deletion Repeated nodes from Specific Node Value of Linked List

class MyLinkedListtttttt {
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
	public void removeNthFromEnd(int n) {
		// Your Logic
		removeRecursion(head,n);
	}
	int r=0;
	public int removeRecursion(Node node,int n) {
		if(node!=null) {
			r=removeRecursion(node.next,n);
			System.out.println(node.data+":"+r);
			if(r==n+1) {
				node.next=node.next.next;
			}
		}
		return ++r;
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

public class LinkedList_RemoveNthFromEnd {

	public static void main(String[] args) {
		MyLinkedListtttttt list = new MyLinkedListtttttt();
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
		list.removeNthFromEnd(3);
		list.printList();
	}

}
