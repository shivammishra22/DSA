class MyList{
	
    class Node{
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
	        System.out.println("Nodes of singly linked list: "); 
            Node currentNode = head;      
	        while(currentNode != null) {     
	            System.out.print(currentNode.data + " ");    
	            currentNode = currentNode.next;    
	        }    
	        System.out.println();
        }
    }  
    public void reverseList() { 
    	//Your Logic
    	Node current=head;
    	Node rev=null;
    	while(current!=null) {
        	Node temp=current.next;
        	current.next=rev;
        	rev=current;
        	current=temp;
    	}
    	tail=head;
    	head=rev;
    }
    
}
public class LinkedList_ReverseList {

	public static void main(String[] args) {
		MyList list=new MyList();
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(9);
		list.addNodeAtEnd(23);
		list.addNodeAtEnd(56);
		list.addNodeAtEnd(3);
		list.printList();
		list.reverseList();
		list.printList();
	}

}
