class MyListt {
	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	public Node head = null;
	public Node tail = null;

	public void addNodeAtEnd(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	public void findAndPrintCycle(Node head) {
		if (head == null) {
			System.out.println("Linked List is empty");
		}else {
			boolean flag = false;
			Node slow = head;
		    Node fast = head;
		    while(fast != null && fast.next != null) {
		    	slow = slow.next;
		        fast = fast.next.next;
		    	if(slow == fast) {
		    		flag= true;
		    		break;
		    	}
		    }
		    if (flag) {
				System.out.println("Cycle Found");
				slow = head;
				while(fast != slow) {
			    	slow = slow.next;
			        fast = fast.next;
			    	if(slow == fast) {
			    		System.out.println("Node: "+slow.data);
			    		break;
			    	}
			    }
			} else {
				System.out.println("No Cycle Found");
			}
		}
	}
	public void findCycle(Node head) {
		if (head == null) {
			System.out.println("Linked List is empty");
		}else {
			boolean flag = false;
			Node slow = head;
		    Node fast = head;
		    while(fast != null && fast.next != null) {
		    	slow = slow.next;
		        fast = fast.next.next;
		    	if(slow == fast) {
		    		flag= true;
		    		break;
		    	}
		    }
		    if (flag) {
				System.out.println("Cycle Found");
			} else {
				System.out.println("No Cycle Found");
			}
		}
	}
}

public class LinkedList_FindCycle {

	public static void main(String[] args) {
		MyListt list = new MyListt();
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(9);
		list.addNodeAtEnd(23);
		list.addNodeAtEnd(56);
		list.addNodeAtEnd(3);
		
		list.tail.next=list.head.next.next;

		list.findCycle(list.head);
		list.findAndPrintCycle(list.head);
	}

}
