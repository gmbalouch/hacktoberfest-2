public class LinkedListStack{
	private Node top;
	private int length;
	private class Node{
		private Object data;
		private Node next;
		public Node(Object data){
			this.data=data;
		}	
	}	
	public LinkedListStack(){
		top=null;
		length=0;
	}
	public int length(){
		return length;
	}
	public boolean isEmpty(){
		return length==0;
	}
	public void push(Object obj){
		Node temp=new Node(obj);
		temp.next=top;
		top=temp;
		length++;
	}
	public Object pop(){
		if(isEmpty()) throw new IllegalStateException();
		Object result = top.data;
		top=top.next;
		length--;
		return result;
	}
	public Object peak(){
		if(isEmpty()){ throw new IllegalStateException();}
		return top.data;
	}
	
	public static void main(String arg[]){
		LinkedListStack stack=new LinkedListStack();
		stack.push("apple");
		stack.push("cheku");
		stack.push("gray fruit");
		stack.pop();
		System.out.println(stack.peak());
		System.out.println(stack.length());		
	}
}
