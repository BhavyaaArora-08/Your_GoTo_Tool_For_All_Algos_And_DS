package Binary_Trees;

import Binary_Trees.BinaryTree.Node;

public class Inorder_Tree_Traversal extends BinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Inorder_Tree_Traversal bt = new Inorder_Tree_Traversal();
		Node y = new Node(15);
		y.left = new Node(10);
		y.right = new Node(40);
		y.left.left = new Node(8);
		y.left.right = new Node(12);
		y.right.left = new Node(16);
		y.right.right = new Node(25);
		y.right.right.right = new Node(90);
		bt.root = y;

		bt.inorder(bt.root);
		System.out.println();
	}

	public void inorder(Node node) {
		if (node == null)
			return;

		inorder(node.left);
		System.out.print(node.data + " ");
		inorder(node.right);
	}

}
