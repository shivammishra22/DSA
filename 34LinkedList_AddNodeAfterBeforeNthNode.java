//Creating Linked List: Insertion after Specific Node Value of Linked List


class MyLinkedListttttt {
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

	public void addNodeAfterNthNode(int n, int data) {
		if(head==null) {
			System.out.println("List is Empty!");
			return;
		}
		Node currentNode=head;
		int i;
		for(i=1;currentNode!=null&&i<n;i++) {
			currentNode=currentNode.next;
		}
		if(currentNode!=null && i==n) {
			Node newNode = new Node(data);
			newNode.next=currentNode.next;
			currentNode.next=newNode;
			if(currentNode==tail) {
				tail=newNode;
			}
		}else {
			System.out.println("Number does not exist!");
		}
	}
	public void addNodeBeforeNthNode(int n, int data) {
		if(head==null) {
			System.out.println("List is Empty!");
			return;
		}
		if(n==1) {
			Node newNode=new Node(data);
			newNode.next=head;
			head=newNode;
			return;
		}
		n--;
		Node currentNode=head;
		int i;
		for(i=1;currentNode!=null&&i<n;i++) {
			currentNode=currentNode.next;
		}
		if(currentNode!=null && currentNode.next!=null && i==n) {
			Node newNode = new Node(data);
			newNode.next=currentNode.next;
			currentNode.next=newNode;
		}else {
			System.out.println("Number does not exist!");
		}
	}
	
	public void printList() {
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

public class LinkedList_AddNodeAfterBeforeNthNode {

	public static void main(String[] args) {
		MyLinkedListttttt list = new MyLinkedListttttt();
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(9);
		list.addNodeAtEnd(23);
		list.addNodeAtEnd(56);
		list.addNodeAtEnd(7);
		list.addNodeAtEnd(13);
		list.addNodeAtEnd(46);
		list.printList();
		list.addNodeAfterNthNode(18, 3);
		list.printList();
		list.addNodeBeforeNthNode(8, 3);
		list.printList();
	}

}
