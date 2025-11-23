class Reverse{
	
	Node head;
	
	static class Node{
		
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	void display(){
		Node n = head;
		while(n != null){
			System.out.print(n.data+ "--->");
			n = n.next;
		}
	}
	
	void reverse(Node n){
		Node prev = null;
		Node next = null;
		Node curr = n;
		while(curr != null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
	}
	
	
	public static void main(String args[]){
		
		Reverse list = new Reverse();
		list.head = new Node(10);
		list.head.next = new Node(20);
		list.head.next.next = new Node(30);
		
		list.display();
		
	}
}