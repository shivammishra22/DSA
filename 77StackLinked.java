class LinkedStack {
	private class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	private Node top;
	private int size;
	public void push(int element) {
		Node newNode=new Node(element);
		newNode.next=top;
		top=newNode;
		size++;
		System.out.println(element+" stored successfully!");
	}
	public void pop() {
		if(top==null) {
    		System.out.println("Stack is Empty!");
    		return;
    	}
		System.out.println(top.data+" removed successfully!");
		top=top.next;
		size--;
	}
	public void traverse() {
		if(top==null) {
    		System.out.println("Stack is Empty!");
    		return;
    	}
		Node currentNode=top;
		while(currentNode!=null) {
			System.out.println(currentNode.data);
			currentNode=currentNode.next;
		}
	}
	public int size() {
		return size;
	}
	public void peek() {
    	if(top==null) {
    		System.out.println("Stack is Empty!");
    		return;
    	}
    	System.out.println("Peek: "+ top.data);
	}
}

public class StackLinked {
	public static void main(String[] args) {
		LinkedStack stack = new LinkedStack();
		System.out.println("Stack Size: " + stack.size());
		stack.traverse();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.peek();
		stack.pop();
		stack.traverse();
		System.out.println("Stack Size: " + stack.size());
	}
}
