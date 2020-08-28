import java.util.ArrayList;
import java.util.List;

public class AllPathTraversal {

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
        BinaryTree5 bt = new BinaryTree5();
        System.out.println(bt.pathTraversal(root));
	}
}

class BinaryTree5{
	public List<String> pathTraversal(Node root) {
		List<String> paths = new ArrayList<>();
		if(root==null){
			return paths;
		}
		dfs(root,"",paths);
		return paths;
	}
	private void dfs(Node root, String path, List<String> paths) {
		path = path + Integer.toString(root.value);
		
		if(root.left==null && root.right==null){
			paths.add(path);
		}	
		if(root.left!=null)
			dfs(root.left,path+"->",paths);
		if(root.right!=null){
			dfs(root.right,path+"->",paths);
		}
	}
}
