import java.util.Queue;
import java.util.LinkedList;

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
        
        Queue<Node> queue = new LinkedList<>();
        
        BinaryTree bt = new BinaryTree();
        bt.levelOrderTraversal(root, queue);
        	
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
   
   public void levelOrderTraversal(Node root, Queue<Node> queue){
       
       if(root==null){
           return;
       }
       queue.offer(root);
       while(!queue.isEmpty()){
           Node element = queue.poll();
           System.out.print(element.value+" ");
           
           if(element.left!=null){
               queue.offer(element.left);
           }
           if(element.right!=null){
               queue.offer(element.right);
           }
       }
       
   }
    
}


/* OUTPUT:
3 6 8 2 11 13 9 5 7 
*/
