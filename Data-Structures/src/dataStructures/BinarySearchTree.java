package dataStructures;

public class BinarySearchTree {
	private Node root;

	public class Node {
		private int data;
		private Node left;
		private Node right;

		public Node(int data) {
			this.data = data;
		}

	}

	public BinarySearchTree(int root) {
		this.root = new Node(root);
		this.root.left = null;
		this.root.right = null;
	}

	public void insert(int node) {
		Node start = root;
		while (true) {
			if (node > start.data) {
				if (start.right == null) {
					start.right = new Node(node);
					return;
				} else {
					start = start.right;
				}
			} else if (node < start.data) {
				if (start.left == null) {
					start.left = new Node(node);
					return;
				} else {
					start = start.left;
				}
			}
		}
	}
	
	public Node search(int node){
		Node start = root;
		while (true) {
			if (node == start.data){
				return start;
			}else if (node > start.data) {
				if (start.right == null) {
					return start;
				} else {
					start = start.right;
				}
			} else {
				if (start.left == null) {
					return start;
				} else {
					start = start.left;
				}
			}
		}
	}

}
