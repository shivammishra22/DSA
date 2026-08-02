//Doubly Linked List Operation: Insertion at End

class MyDoublyLinkedList1{
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
        	head = tail = newNode;
        }else {    
			newNode.previous=tail;   
    		tail.next = newNode;       
			tail = newNode;
        }    
    }    
	public void printListForward() {    
        if(head == null) {    
            System.out.println("Linked List is empty"); 
        }else { 
        	System.out.println("Nodes of Doubly linked list: "); 
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
	        Node currentNode = tail;  
	        while(currentNode != null) {     
	            System.out.print(currentNode.data + " ");    
	            currentNode = currentNode.previous;    
	        }    
	        System.out.println();
        }
    }
}
public class DoublyLinkedList1 {

	public static void main(String[] args) {
		MyDoublyLinkedList1 list=new MyDoublyLinkedList1();
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(9);
		list.addNodeAtEnd(23);
		list.addNodeAtEnd(56);
		list.addNodeAtEnd(3);
		list.printListForward();
		list.printListBackward();
	}

}
