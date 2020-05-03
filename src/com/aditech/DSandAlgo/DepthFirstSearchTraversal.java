package com.aditech.DSandAlgo;

public class DepthFirstSearchTraversal {

	// Root of a tree
	Node root;

	DepthFirstSearchTraversal() {
		root = null;
	}

	// Inorder traversal on a tree using recurssion
	// <Left><Root><Right>
	void printInorder(Node node) {

		if (node == null) {
			return;
		}

		// first recur on the left child
		printInorder(node.left);

		// Then print the data of a Node
		System.out.print(node.key + "->");

		// Then print the right child
		printInorder(node.right);
	}

	// Preorder traversal on a tree using recurssion
	// <Root><Left><Right>
	void printPreorder(Node node) {

		if (node == null) {
			return;
		}

		// first print the data of a Node
		System.out.print(node.key + "->");

		// then recur on the left child
		printPreorder(node.left);

		// Then recur the right child
		printPreorder(node.right);
	}

	// Postorder traversal on a tree using recurssion
	// <Left><Right><Root>
	void printPostorder(Node node) {

		if (node == null) {
			return;
		}

		// first recur on the left child
		printPostorder(node.left);

		// Then print the right child
		printPostorder(node.right);

		// Then print the data of a Node
		System.out.print(node.key + "->");
	}

	// Wrappers over above recursive functions
	void printPostorder() {

		printPostorder(root);
	}
	void printInorder() {

		printInorder(root);
	}
	void printPreorder() {

		printPreorder(root);
	}

	public static void main(String[] args) {

		DepthFirstSearchTraversal dfs = new DepthFirstSearchTraversal();
		dfs.root = new Node(1);
		dfs.root.left = new Node(2);
		dfs.root.right = new Node(3);
		dfs.root.left.left = new Node(4);
		dfs.root.left.right = new Node(5);

		dfs.printPreorder();
		System.out.println("--------- Preorder traversal");

		dfs.printInorder();
		System.out.println("--------- Inorder traversal");

		dfs.printPostorder();
		System.out.println("--------- Postorder traversal ");
	}

}
