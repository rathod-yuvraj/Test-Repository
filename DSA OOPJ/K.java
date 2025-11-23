class K{
	Node root;
	
	static class Node{
		int data;
		Node left,right;
		
		Node(int d){
			data = d;
			left = right = null;
		}
	}
	
	K(){
		root = null;
	}
	
	K(int d){
		root = new Node(d);
	}
	
	void inorder(Node n){
		if(n == null)
			return;
		inorder(n.left);
		System.out.print(n.data+ " ");
		inorder(n.right);
	}
	
	void preorder(Node n){
		if(n == null)
			return;
		System.out.print(n.data + " ");
		preorder(n.left);
		preorder(n.right);
	}
	
	void postorder(Node n ){
		if(n == null)
			return;
		postorder(n.left);
		postorder(n.right);
		System.out.print(n.data + " ");
	}
	
	public static void main(String args[]){
		K k1 = new K();
		k1.root = new Node(11);
		k1.root.left = new Node(22);
		k1.root.right = new Node(33);
		k1.root.left.left = new Node(44);
		k1.root.left.right = new Node(55);
		k1.root.right.left = new Node(66);
		k1.root.right.right = new Node(77);
		
		System.out.println();
		k1.inorder(k1.root);
		System.out.println();
		
		k1.preorder(k1.root);
		System.out.println();
		
		k1.postorder(k1.root);
	}
	
	
}