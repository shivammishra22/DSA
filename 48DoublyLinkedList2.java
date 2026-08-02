//Doubly Linked List Operation: Insertion at Beginning

class MyDoublyLinkedList2{
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
	
	public void addNodeAtBegin(int data) { 
		Node newNode = new Node(data);  
        if (head == null) {
        	head = tail = newNode;
        }else {    
    		newNode.next=head;   
        	head.previous = newNode;     
        	head = newNode;
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
public class DoublyLinkedList2 {

	public static void main(String[] args) {
		MyDoublyLinkedList2 list=new MyDoublyLinkedList2();
		list.addNodeAtBegin(5);
		list.addNodeAtBegin(9);
		list.addNodeAtBegin(23);
		list.addNodeAtBegin(56);
		list.addNodeAtBegin(3);
		list.printListForward();
		list.printListBackward();
	}

}
