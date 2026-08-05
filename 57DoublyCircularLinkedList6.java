//DoublyCircular Linked List Operation:  Deletion at Specific Node Value


class MyDoublyCircularLinkedList6{
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
        newNode.next = head;
        newNode.prev = head.prev;
        head.prev.next = newNode;
        head.prev = newNode;
    }
	
	public void deleteNodeAtSpecificNodeValueFirstComes(int locationValue)  {
		// Checks if the list is empty
		if (head == null) {
			System.out.println("list is empty");
		} else if (locationValue == head.data && head.next == head) {
			head=null;	
		} else {
			Node currentNode = head;
			boolean flag=false;
			do{
				if (currentNode.data == locationValue) {
					flag = true;
					break;
				}
				currentNode = currentNode.next;
			} while (currentNode != head) ;
			if (flag) {
				currentNode.next.prev=currentNode.prev;
				currentNode.prev.next=currentNode.next;
				if(currentNode==head) {
					head=head.next;
				}
			} else {
				System.out.println("Location Value does not exist.");
			}
		}
	}
	public void deleteNodeAtSpecificNodeValueNoDuplicates(int locationValue)  {
		// Checks if the list is empty
		if (head == null) {
			System.out.println("list is empty");
		} else if (locationValue == head.data && head.next == head) {
			head=null;	
		}else if(head.prev.data==locationValue) {
			head.prev=head.prev.prev;
			head.prev.next=head;
		}else {
			Node currentNode = head;
			boolean flag=false;
			while (currentNode.next != head) {
				if (currentNode.data == locationValue) {
					flag = true;
					break;
				}
				currentNode = currentNode.next;
			} 
			if (flag) {
				currentNode.next.prev=currentNode.prev;
				currentNode.prev.next=currentNode.next;
				if(currentNode==head) {
					head=head.next;
				}
			} else {
				System.out.println("Location Value does not exist.");
			}
		}
	}
	public void deleteNodeAllAtSpecificNodeValue(int locationValue)  {
		//your logic
	}
	
    public void printListForward() {
        if (head == null) {
        	System.out.println("DoublyCircular Linked List is empty!");
        }else {
        	System.out.println("Nodes of DoublyCircular Linked List: "); 
	        Node currentNode = head;
	        do {
	            System.out.print(currentNode.data + " ");
	            currentNode = currentNode.next;
	        }while(currentNode != head);
	        System.out.println();
        }
    }
    public void printListBackward() {
        if (head == null) {
        	System.out.println("DoublyCircular Linked List is empty!");
        }else {
        	System.out.println("Nodes of DoublyCircular Linked List: "); 
	        Node currentNode = head.prev;
	        do {
	            System.out.print(currentNode.data + " ");
	            currentNode = currentNode.prev;
	        }while(currentNode != head.prev);
	        System.out.println();
        }
    }
}
public class DoublyCircularLinkedList6 {

	public static void main(String[] args) {
		MyDoublyCircularLinkedList6 list=new MyDoublyCircularLinkedList6();
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(9);
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(56);
		list.addNodeAtEnd(5);

		list.printListForward();
		list.deleteNodeAtSpecificNodeValueFirstComes(5);
		list.deleteNodeAtSpecificNodeValueNoDuplicates(5);
		list.printListForward();
	}

}
