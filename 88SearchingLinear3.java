class MyLinkedList{
	private class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	private Node head;
	private Node tail;
	public void addNodeAtEnd(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=tail=newNode;
		}else {
			tail.next=newNode;
			tail=newNode;
		}
	}
	public void printList() {
		if(head==null) {
			System.out.println("Linked List is EMPTY!");
			return;
		}
		Node currentNode=head;
		while(currentNode!=null) {
			System.out.print(currentNode.data+" ");
			currentNode=currentNode.next;
		}
		System.out.println();
	}

    void search(int value) {
		boolean flag=false;
		Node currentNode = head; 
		while(currentNode != null) {   
			if(value==currentNode.data) {
				flag=true;
				break;
			}
			currentNode = currentNode.next;  
		}
		if(flag) {
			System.out.println(value+" found!");
		}else {
			System.out.println(value+" not found!");
		}
    }
    void searchAll(int value) {
		int count=0;
		Node currentNode = head; 
		while(currentNode != null) {   
			if(value==currentNode.data) {
				count++;
			}
			currentNode = currentNode.next;  
		}
		if(count>0) {
			System.out.println(value+" found "+ count+" times!");
		}else {
			System.out.println(value+" not found!");
		}
    }
}
public class SearchingLinear3 {

	public static void main(String[] args) {
		
		MyLinkedList list=new MyLinkedList();
		list.addNodeAtEnd(5);
		list.addNodeAtEnd(9);
		list.addNodeAtEnd(23);
		list.addNodeAtEnd(56);
		list.addNodeAtEnd(9);
		list.addNodeAtEnd(3);
		list.addNodeAtEnd(9);
		list.printList();
		list.search(9);
		list.searchAll(9);
		
		
	}

}
