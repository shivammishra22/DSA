//Creating Linked List: Deletion from Specific Node Value of Linked List

class MyLinkedList6 {
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
	public void deleteSpecificNode(int locationValue) {
		if (head == null) {
			System.out.println("List is Empty.");
			return;
		} 
		if(locationValue==head.data && head==tail) {
			head=tail=null;
		}else if(locationValue==head.data) {
			head=head.next;
		}else {
			Node currentNode=head;
			boolean flag=false;
			while(currentNode.next!=null) {
				if(currentNode.next.data == locationValue ) {
					flag=true;
					break;
				}
				currentNode=currentNode.next;
			}
			if(flag) {
				currentNode.next=currentNode.next.next;
				if(currentNode.next==null) {
					tail=currentNode;
				}
			}else {
				System.out.println("Location Node does not exist!");
			}
		}
	}
	public void deleteNthNode(int n) {
		//your logic
	}
	public void deleteAllSpecificNode(int locationValue) {
		//your logic
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

public class LinkedList6 {

	public static void main(String[] args) {
		MyLinkedList6 list = new MyLinkedList6();
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(8);
		list.addNodeAtEnd(2);
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(7);
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(5);
		list.printList();
		list.deleteNthNode(6);
		list.deleteSpecificNode(5);
		list.deleteAllSpecificNode(5);
		list.printList();
	}

}
