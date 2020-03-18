package Binary_Trees;

import Binary_Trees.BinaryTree.Node;

public class Height_Of_Binary_Tree extends BinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// construct second tree
        Node y = new Node(15);
        y.left = new Node(10);
        y.right = new Node(40);
        y.left.left = new Node(8);
        y.left.right = new Node(12);
        y.right.left = new Node(16);
        y.right.right = new Node(25);
        y.right.right.right=new Node(90);
        
        Height_Of_Binary_Tree bt1=new Height_Of_Binary_Tree();
		bt1.root=y;
        System.out.println(bt1.height(bt1.root));
	}

	public int height(Node node)
	{
		if(node==null)
			return -1;
		
		return Math.max(height(node.left), height(node.right))+1;
	}
	
	/* Tree is:-
	 * 10<--15-->40
	 * 8 <--10-->12
	 * 16<--10-->25
	 * . <--25-->90
	*/
}
