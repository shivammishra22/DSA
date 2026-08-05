//DoublyCircular Linked List Operation: Insertion after Specific Node Value of Linked List


class MyDoublyCircularLinkedList3 {
	private class Node{
		int data;
		Node next;
		Node prev;
		public Node(int data) {    
            this.data = data;    
            this.next = null;  
            this.prev = null;     
        }
	}
	private Node head;  
	
	public void addNodeAtEnd(int data) {
		Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
            return;
        }
        Node lastNode=head.prev;
        
        newNode.next = head;
        newNode.prev = lastNode;
        lastNode.next = newNode;
        head.prev = newNode;
	}

	public void addNodeAfterSpecificNodeValueFirstComes(int locationValue, int data) {
		// Checks if the list is empty
		if (head == null) {
			System.out.println("list is empty");
			return;
		}
		Node currentNode = head;
		boolean flag=false;
		do {
			if (currentNode.data == locationValue) {
				flag=true;
				break;
			}
			currentNode = currentNode.next;
		} while (currentNode != head);

		if (flag) {
			// Create a new node
			Node newNode = new Node(data);
			newNode.next = currentNode.next;
			newNode.prev = currentNode;
			currentNode.next.prev = newNode;
			currentNode.next = newNode;
			
		} else {
			System.out.println("Location Value does not exist.");
		}
	}
	public void addNodeBeforeSpecificNodeValueFirstComes(int locationValue, int data) {
		// Checks if the list is empty
		if (head == null) {
			System.out.println("list is empty");
			return;
		}
		Node currentNode = head;
		boolean flag=false;
		do {
			if (currentNode.data == locationValue) {
				flag=true;
				break;
			}
			currentNode = currentNode.next;
		} while (currentNode != head);

		if (flag) {
			// Create a new node
			Node newNode = new Node(data);
			newNode.next = currentNode;
			newNode.prev = currentNode.prev;
			currentNode.prev.next = newNode;
			currentNode.prev = newNode;
			if(currentNode==head) {
				head=newNode;
			}
			
		} else {
			System.out.println("Location Value does not exist.");
		}
	}
	public void addNodeAfterSpecificNodeValueNoDuplicates(int locationValue, int data) {
		// Checks if the list is empty
		if (head == null) {
			System.out.println("list is empty");
		}else if(head.prev.data==locationValue) {
			// Create a new node
			Node newNode = new Node(data);
			newNode.prev = head.prev;
	        newNode.next = head;
	        head.prev.next = newNode;
	        head.prev = newNode;
		}else {
			Node currentNode = head;
			boolean flag=false;
			while (currentNode.next != head) {
				if (currentNode.data == locationValue) {
					flag=true;
					break;
				}
				currentNode = currentNode.next;
			} 
			if (flag) {
				// Create a new node
				Node newNode = new Node(data);
				newNode.next = currentNode.next;
				newNode.prev = currentNode;
				currentNode.next.prev = newNode;
				currentNode.next = newNode;
				
			} else {
				System.out.println("Location Value does not exist.");
			}
		}
	}
	public void addNodeBeforeSpecificNodeValueNoDuplicates(int locationValue, int data) {
		// Checks if the list is empty
		if (head == null) {
			System.out.println("list is empty");
			return;
		}else if(head.prev.data==locationValue) {
			// Create a new node
			Node newNode = new Node(data);
			newNode.next = head.prev;
	        newNode.prev = head.prev.prev;
	        head.prev.prev.next = newNode;
	        head.prev.prev = newNode;
	        if(head.data==locationValue) {
	        	head = newNode;
	        }
		}else {
			Node currentNode = head;
			boolean flag=false;
			while (currentNode.next != head) {
				if (currentNode.data == locationValue) {
					flag=true;
					break;
				}
				currentNode = currentNode.next;
			} 
			if (flag) {
				// Create a new node
				Node newNode = new Node(data);
				newNode.next = currentNode;
				newNode.prev = currentNode.prev;
				currentNode.prev.next = newNode;
				currentNode.prev = newNode;
				if(currentNode==head) {
					head=newNode;
				}
				
			} else {
				System.out.println("Location Value does not exist.");
			}
		}
	}

	public void printListForward() {
		if (head == null) {
			System.out.println("DoublyCircular Linked List is empty!");
		} else {
			System.out.println("Nodes of DoublyCircular Linked List: ");
			Node currentNode = head;
			do {
				System.out.print(currentNode.data + " ");
				currentNode = currentNode.next;
			} while (currentNode != head);
			System.out.println();
		}
	}

	public void printListBackward() {
		if (head == null) {
			System.out.println("DoublyCircular Linked List is empty!");
		} else {
			System.out.println("Nodes of DoublyCircular Linked List: ");
			Node currentNode = head.prev;
			do {
				System.out.print(currentNode.data + " ");
				currentNode = currentNode.prev;
			} while (currentNode != head.prev);
			System.out.println();
		}
	}
}

public class DoublyCircularLinkedList3 {

	public static void main(String[] args) {
		MyDoublyCircularLinkedList3 list = new MyDoublyCircularLinkedList3();
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(9);
		list.addNodeAtEnd(23);
		list.addNodeAtEnd(56);
		list.addNodeAtEnd(3);

		list.printListForward();
		
		list.addNodeAfterSpecificNodeValueFirstComes(23, 65);
		list.addNodeBeforeSpecificNodeValueFirstComes(23, 65);
		list.addNodeAfterSpecificNodeValueNoDuplicates(23, 65);
		list.addNodeAfterSpecificNodeValueNoDuplicates(23, 65);

		list.printListForward();
	}

}
