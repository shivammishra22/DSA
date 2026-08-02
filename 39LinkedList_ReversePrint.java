class MyListtt{
	
    private class Node{
    	int data;
    	Node next;
    	public Node(int data) {    
            this.data = data;    
            this.next = null;    
        }
    } 
    
    private Node head = null;    
    private Node tail = null;  
    
	public void addNodeAtEnd(int data) {    
        Node newNode = new Node(data);    
        if(head == null) {    
            head = tail = newNode;    
        }    
        else {    
            tail.next = newNode;    
            tail = newNode;    
        }    
    }    
    public void printList() {   
        if(head == null) {    
            System.out.println("Linked List is empty"); 
        }else {  
	        System.out.println("Nodes of Linked list: "); 
            Node currentNode = head;      
	        while(currentNode != null) {     
	            System.out.print(currentNode.data + " ");    
	            currentNode = currentNode.next;    
	        }    
	        System.out.println();
        }
    }  
    public void reversePrint() { 
	    	System.out.println("Printing in Reverse");
	    	reverse(head);
	    	System.out.println();
    }
    private void reverse(Node n) {
	    	if(n!=null) {
	    		reverse(n.next);
	        	System.out.print(n.data+" ");
	    	}
    }
    
}
public class LinkedList_ReversePrint {

	public static void main(String[] args) {
		MyListtt list=new MyListtt();
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(9);
		list.addNodeAtEnd(23);
		list.addNodeAtEnd(56);
		list.addNodeAtEnd(3);
		list.printList();
		list.reversePrint();
	}

}
