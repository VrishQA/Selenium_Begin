package list;

public class ImplementStack_LL {
	
	//Node class to represent LL's node
	public static class Node{
		int data;
		Node next;
		
		
		public Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	//creating a stack class where all push, pop, peek methods will be defined
	public static class Stack{
	public static Node head;//this denotes LL's head and stacks top item
	
	
	public static boolean isEmpty() {//check if stack is empty
		
		return head==null;
	}
	
	public static void push(int data) {
		Node newNode= new Node (data);
		if(isEmpty()) {
			head =newNode;
			return;
		}
		
		newNode.next=head;
		head=newNode;
	}
	
	public static int pop() {
		if(isEmpty()) {
			 
			return -1;
		}
		int top=head.data;
		head=head.next;
		return top;
		
		
	}
	
	public static int peek() {
		if(isEmpty()) {
			 
			return -1;
		}
		
		return head.data;
	}
	
	
	
	}


	public static void main(String[] args) {
		
		Stack s= new Stack();
		s.push(0);
		s.push(1);
		s.push(2);
		s.push(3);
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}

	}

}

