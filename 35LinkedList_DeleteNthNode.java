//Creating Linked List: Deletion Nth Node of Linked List


class MyLinkedListttttttt {
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
		Node newNode = new Node(data);
		if (head == null) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	public void deleteNthNode(int n) {
		if (head == null) {
			System.out.println("List is Empty.");
			return;
		} 
		if(n==1 && head==tail) {
			head=tail=null;
			return;
		}if(n==1) {
			head=head.next;
			return;
		}
		n--;
		int i;
		Node currentNode=head;
		for(i=1;currentNode.next!=null && i<n;i++) {
			currentNode=currentNode.next;
		}
		if(i==n && currentNode.next!=null) {
			currentNode.next=currentNode.next.next;
			if(currentNode.next==null) {
				tail=currentNode;
			}
		}else {
			System.out.println("Invalid Number: Out of size!");
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

public class LinkedList_DeleteNthNode {

	public static void main(String[] args) {
		MyLinkedListttttttt list = new MyLinkedListttttttt();
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(8);
		list.addNodeAtEnd(2);
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(7);
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(15);
		list.printList();
		list.deleteNthNode(3);
		list.printList();
	}

}
