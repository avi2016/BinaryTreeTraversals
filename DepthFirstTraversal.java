class DepthFirstTraversal {
	public static void main (String[] args) {
		
		Node root = new Node(3);

		root.left = new Node(6);
		root.left.left = new Node(2);
		root.left.right = new Node(11);
		root.left.right.left = new Node(9);
		root.left.right.right = new Node(5);

		root.right = new Node(8);
        	root.right.right = new Node(13);
        	root.right.right.left = new Node(7);
		
	/*
                    3
                  /  \
                6     8
               / \     \
             2    11    13
                 / \    /
                9   5  7
       */	
        
        	BinaryTree bt = new BinaryTree();
        	System.out.print("PreOrderTraversal: "); 
        	bt.preOrderTraversal(root);
        	System.out.println();
        	System.out.print("InOrderTraversal: " );
        	bt.inOrderTraversal(root);
		System.out.println();
		System.out.print("PostOrderTraversal: ");
		bt.postOrderTraversal(root);
	}
}

class Node{
    
    Node left;
    Node right;
    int value;
    
    Node(int value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree{
    
    public void inOrderTraversal(Node root){
        if(root==null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.value+ "  ");
        inOrderTraversal(root.right);
    }
    
    public void preOrderTraversal(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.value+"  ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
	
	public void postOrderTraversal(Node root){
		if(root!=null){
			postOrderTraversal(root.left);
		 	postOrderTraversal(root.right);
			System.out.print(root.value+"  ");
	 	}
    	}
	
    
}


/* OUTPUT:
	PreOrderTraversal: 3  6  2  11  9  5  8  13  7  
	InOrderTraversal: 2  6  9  11  5  3  8  7  13  
	PostOrderTraversal: 2  9  5  11  6  7  13  8  3  
*/
