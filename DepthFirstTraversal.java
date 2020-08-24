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
        
        BinaryTree bt = new BinaryTree();
        bt.preOrderTraversal(root);
        System.out.println();
        bt.inOrderTraversal(root);
        
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
}
