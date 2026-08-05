class ArrayStack {
    private int[] s;
    private int top;
    private int capacity;

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        s = new int[capacity];
        top = 0;//optional
    }

    public void push(int element) {
        if(top==capacity) {
        	System.out.println("Stack is Full!");
        	return;
        }
        s[top]=element;
        top++;
    	System.out.println(element+" stored successfully!");
    }
    public void pop() {
    	if(top==0) {
    		System.out.println("Stack is Empty!");
    		return;
    	}
    	top--;
    	System.out.println(s[top]+" removed successfully!");
    }
    public void traverse() {
    	if(top==0) {
    		System.out.println("Stack is Empty!");
    		return;
    	}
    	for(int x=top-1;x>=0;x--) {
    		System.out.println(s[x]);
    	}
    }
    public void peek() {
    	if(top==0) {
    		System.out.println("Stack is Empty!");
    		return;
    	}
    	System.out.println("Peek: "+ s[top-1]);
	}
    public int size() {
		return top;
	}
}
public class StackArray {
	public static void main(String[] args) {
		ArrayStack stack = new ArrayStack(5);
		System.out.println(stack.size());
		stack.traverse();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60); // This will print "Stack is full. Cannot push element."

		System.out.println(stack.size());
		stack.peek();
		stack.traverse();
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.traverse();
	}
}
