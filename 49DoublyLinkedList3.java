//Doubly Linked List Operation: Insertion after Specific Node Value of Linked List


class MyDoublyLinkedList3 {
	private class Node{
		int data;
		Node next;
		Node previous;
		public Node(int data) {    
            this.data = data;    
            this.next = null;  
            this.previous = null;     
        }
	} 
	private Node head;    
	private Node tail; 
	
	public void addNodeAtEnd(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;
		}
	}

	public void addNodeAfterSpecificNodeValue(int locationValue, int data) {
		if (head == null) {
			System.out.println("list is empty");
		}else {
			boolean flag=false;
			Node currentNode = head;
			
			while (currentNode != null) {
				if (currentNode.data == locationValue) {
					flag=true;
					break;
				}
				currentNode = currentNode.next;
			} 
			if (flag) {
				Node newNode = new Node(data);
				newNode.next=currentNode.next;
				newNode.previous=currentNode;
				currentNode.next=newNode;
				if(currentNode==tail) {
					tail=newNode;
				}else {
					newNode.next.previous=newNode;
				}
			} else {
				System.out.println("Location Value does not exist.");
			}
		}
	}
	public void addNodeBeforeSpecificNodeValue(int locationValue, int data) {
		if (head == null) {
			System.out.println("list is empty");
		}else {
			boolean flag=false;
			Node currentNode = head;
			
			while (currentNode != null) {
				if (currentNode.data == locationValue) {
					flag=true;
					break;
				}
				currentNode = currentNode.next;
			} 
			if (flag) {
				Node newNode = new Node(data);
				newNode.next=currentNode;
				newNode.previous=currentNode.previous;
				currentNode.previous=newNode;
				if(currentNode==head) {
					head=newNode;
				}else {
					newNode.previous.next=newNode;
				}
			} else {
				System.out.println("Location Value does not exist.");
			}
		}
	}

	public void printListForward() {    
        if(head == null) {    
            System.out.println("Linked List is empty"); 
        }else { 
        	System.out.println("Nodes of Doubly linked list: ");    
	        
        	//currentNode will point to head    
            Node currentNode = head;   
	        while(currentNode != null) {     
	            System.out.print(currentNode.data + " ");    
	            currentNode = currentNode.next;    
	        }    
	        System.out.println();
        }
    }   
    
    public void printListBackward() {    
          
        if(head == null) {    
            System.out.println("Linked List is empty"); 
        }else {    
	        System.out.println("Nodes of Doubly linked list: ");    
	        
	        //currentNode will point to tail    
	        Node currentNode = tail;  
	        while(currentNode != null) {     
	            System.out.print(currentNode.data + " ");    
	            currentNode = currentNode.previous;    
	        }    
	        System.out.println();
        }
    }
}

public class DoublyLinkedList3 {

	public static void main(String[] args) {
		MyDoublyLinkedList3 list = new MyDoublyLinkedList3();
		list.addNodeAtEnd(25);
		list.addNodeAtEnd(6);
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(78);
		list.addNodeAtEnd(45);
		list.addNodeAtEnd(15);
		list.printListForward();
		list.addNodeAfterSpecificNodeValue(15, 87);
		list.addNodeBeforeSpecificNodeValue(15, 87);
		list.printListForward();
	}

}
