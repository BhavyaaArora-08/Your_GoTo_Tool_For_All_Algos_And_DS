package Binary_Trees;

import Binary_Trees.BinaryTree.Node;

public class Identical_Binary_Trees extends BinaryTree{
	
	//recursive approach
	public boolean isIdentical(Node root1,Node root2)
	{
		if(root1==null && root2==null)
			return true;
		
		if(root1==null || root2==null)
			return false;
	 
		boolean left = isIdentical(root1.left, root2.left);
		boolean right = isIdentical(root1.right, root2.right);
		
		return (root1.data==root2.data) && left && right;
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Identical_Binary_Trees bt1=new Identical_Binary_Trees();
		Identical_Binary_Trees bt2=new Identical_Binary_Trees();
		
		 // construct first tree
        Node x = new Node(15);
        x.left = new Node(10);
        x.right = new Node(20);
        x.left.left = new Node(8);
        x.left.right = new Node(12);
        x.right.left = new Node(16);
        x.right.right = new Node(25);
 
        // construct second tree
        Node y = new Node(15);
        y.left = new Node(10);
        y.right = new Node(40);
        y.left.left = new Node(8);
        y.left.right = new Node(12);
        y.right.left = new Node(16);
        y.right.right = new Node(25);
        
        bt1.root=x;
        bt2.root=y;
        
        System.out.println(bt1.isIdentical(x,y));
	}

}
