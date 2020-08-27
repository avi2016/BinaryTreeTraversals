package com.spiral;

import java.util.Stack;

public class SpiralOrderTraversal2Stack {
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
        
        BinaryTree3 bt = new BinaryTree3();
        bt.spiralOrderTraversal(root);
        	
	}
}


class BinaryTree3 {
	
	Stack<Node> s1 = new Stack<>();
	Stack<Node> s2 = new Stack<>();
	
	
	public void spiralOrderTraversal(Node root) {

		s1.push(root);

		while (!s1.isEmpty() || !s2.isEmpty()) {
			while (!s1.isEmpty()) {
				Node node = s1.pop();
				System.out.print(node.value +" ");
				if (node.left != null) {
					s2.push(node.left);
				}
				if (node.right != null) {
					s2.push(node.right);
				}
			}

			while (!s2.isEmpty()) {
				Node node = s2.pop();
				System.out.print(node.value+" ");
				if(node.right!=null){
					s1.push(node.right);
				}
				if(node.left!=null){
					s1.push(node.left);
				}
			}
		}
	}
}


/* OUTPUT:
  3 8 6 2 11 13 7 5 9
*/

