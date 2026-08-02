//Creating Linked List: Insertion at End

class MyLinkedList1{
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
		System.out.println("Nodes of Linked list: ");
		Node currentNode=head;
		while(currentNode!=null) {
			System.out.print(currentNode.data+" ");
			currentNode=currentNode.next;
		}
		System.out.println();
	}

	public void printListInReverse() {
		//your logic
	}
	public void searchNode(int v) {
		if(head==null) {
			System.out.println("Linked List is EMPTY!");
			return;
		}
		boolean flag=false;
		Node currentNode=head;
		while(currentNode!=null) {
			if(currentNode.data==v) {
				flag=true;
				break;
			}
			currentNode=currentNode.next;
		}
		if(flag) {
			System.out.println(v+ " Found!");
		}else {
			System.out.println(v+ " NOT Found!");
		}
	}
	public void getValueAt(int n) {
		boolean flag=false;
		Node currentNode=head;
		while(currentNode!=null) {
			if(n--==1) {
				flag=true;
				break;
			}
			currentNode=currentNode.next;
		}
		if(flag) {
			System.out.println("Value = "+currentNode.data);
		}else {
			System.out.println("Number Out of Boundary!");
		}
	}
}
public class LinkedList1 {

	public static void main(String[] args) {
		MyLinkedList1 list=new MyLinkedList1();
		list.printList();
		list.addNodeAtEnd(4);
		list.addNodeAtEnd(7);
		list.addNodeAtEnd(9);
		list.addNodeAtEnd(3);
		list.addNodeAtEnd(9);
		list.addNodeAtEnd(2);
		list.printList();
		
	}

}
