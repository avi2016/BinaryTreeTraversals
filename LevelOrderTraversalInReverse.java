import java.util.Queue;
import java.util.LinkedList;

public class LevelOrderTraversalInReverse {
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
        bt.levelOrderTraversalInReverse(root);
        	
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
   
   Queue<Node> queue = new LinkedList<>();
   
   void levelOrderTraversalInReverse(Node root){
       queue.offer(root);
       while(!queue.isEmpty()){
           Node node = queue.poll();
           System.out.print(node.value+" ");
           if(node.right!=null){
               queue.offer(node.right);
           }
           if(node.left!=null){
               queue.offer(node.left);
           }
       }
   }
   
}


/* OUTPUT:
 	3 8 6 13 11 2 7 5 9 
*/

