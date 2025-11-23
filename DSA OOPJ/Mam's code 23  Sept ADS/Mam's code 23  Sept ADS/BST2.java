


class BST1{
	
	Node root;
	
	static class Node{
	int data;
	Node left, right;
	
	Node(int d){
		data = d;
		left = right = null;
	}
	}
	
	BST1()
	{
		root = null;
	}
	
		
	//Inorder: LC, Root, RC
	void inorder(Node n){
		if(n == null)
			return;
		inorder(n.left);
		System.out.print(n.data + " ");
		inorder(n.right);
		
		
	}
	
	void insert(int key){
		root = insertdata(root,key);
	}
	
	Node insertdata(Node root, int key){
		if (root == null)
		{
			root = new Node(key);
			return root;
		}
		if(key < root.data)
			root.left = insertdata(root.left, key);
		else if(key > root.data)
			root.right = insertdata(root.right, key);
			
		return root;
		
		
		
		
	}
	
	//Deletion
		void delete(int key){
		root = deletedata(root,key);
	}
	
	Node deletedata(Node root, int key){
		
		if(root == null)
			return root;
		if(key < root.data)
			root.left = deletedata(root.left, key);
		else if(key > root.data)
			root.right = deletedata(root.right, key);
		else{
			if(root.left == null)
				return root.right;
			if(root.right == null)
				return root.left;
			root.data = minvalue(root.right);
			root.right = deletedata(root.right, root.data);
			
			
		}
		return root;
	}
	
	 int minvalue(Node root)
	 {
		 int x = root.data;
		 while(root.left != null){
			 
			 x = root.left.data;
			 root=root.left;
			 
		 }
		 return x;
	 }
	
	
	
    public static void main(String[] args)
	{
		BST1 t1= new BST1();
		t1.insert(50);
		t1.insert(47);
		t1.insert(34);
		t1.insert(61);
		t1.insert(72);
		t1.insert(91);
		t1.insert(49);
		t1.insert(11);
		t1.insert(51);
		
		System.out.println("Inorder:");
		t1.inorder(t1.root);
		System.out.println();
		
		t1.delete(11);
		
		System.out.println("Inorder:case 1");
		t1.inorder(t1.root);
		System.out.println();
		
		/*t1.delete(91);
		
		System.out.println("Inorder:case 1");
		t1.inorder(t1.root);
		System.out.println();
		*/
		t1.delete(72);
		
		System.out.println("Inorder:case 2");
		t1.inorder(t1.root);
		System.out.println();
		
		t1.delete(50);
		
		System.out.println("Inorder:case 3");
		t1.inorder(t1.root);
		System.out.println();
	
		
    }
    
 
}
