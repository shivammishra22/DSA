//Creating Linked List: Insertion after Specific Node Value of Linked List

class MyLinkedList3 {
	private Node head;
	private Node tail;

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

	public void addNodeAfterSpecificNodeValue(int locationValue, int data) {
		if(head==null) {
			System.out.println("List is Empty!");
			return;
		}
		Node currentNode=head;
		boolean flag=false;
		while(currentNode!=null) {
			if(currentNode.data == locationValue) {
				flag=true;
				break;
			}
			currentNode=currentNode.next;
		}
		if(flag) {
			Node newNode = new Node(data);
			newNode.next=currentNode.next;
			currentNode.next=newNode;
			if(currentNode==tail) {
				tail=newNode;
			}
		}else {
			System.out.println("Location Node does not exist!");
		}
	}
	public void addNodeBeforeSpecificNodeValue(int locationValue, int data) {
		if(head==null) {
			System.out.println("List is Empty!");
			return;
		}
		if(locationValue==head.data) {
			Node newNode=new Node(data);
			newNode.next=head;
			head=newNode;
			return;
		}
		boolean flag=false;
		Node currentNode=head;
		while (currentNode.next!=null) {
			if(currentNode.next.data==locationValue) {
				flag=true;
				break;
			}
			currentNode=currentNode.next;
		}
		if(flag) {
			Node newNode=new Node(data);
			newNode.next=currentNode.next;
			currentNode.next=newNode;
		}else {
			System.out.println("Location Node does not exist!");
		}
	}
	public void addNodeAfterNthNode(int number, int data) {
		//your logic
	}
	public void addNodeBeforeNthNode(int number, int data) {
		//your logic
	}
}

public class LinkedList3 {

	public static void main(String[] args) {
		MyLinkedList3 list = new MyLinkedList3();
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(9);
		list.addNodeAtEnd(23);
		list.addNodeAtEnd(46);
		list.addNodeAtEnd(7);
		list.addNodeAtEnd(13);
		list.addNodeAtEnd(56);
		list.printList();
		list.addNodeAfterSpecificNodeValue(46, 3);
		list.printList();
		list.addNodeAfterNthNode(2, 3);
		list.printList();
		list.addNodeBeforeNthNode(2, 3);
		list.printList();
		list.addNodeBeforeSpecificNodeValue(46, 3);
		list.printList();
	}

}
