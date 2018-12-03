package com.java.basics;

public class BinaryTreeSample {
	Node root;

	// create tree
	public static BinaryTreeSample createBinaryTree() {
		BinaryTreeSample bt = new BinaryTreeSample();
	 
		bt.add(9);
	    bt.add(6);
	    bt.add(4);
	    bt.add(8);
	    bt.add(3);
	    bt.add(5);
	    bt.add(7);
	 
	    return bt;
	}
	
	// add nodes
	private Node addRecursive(Node current, int value) {
		if (current == null) {
			return new Node(value);
		}
		if (value < current.value) {
			current.left = addRecursive(current.left, value);
		} else if (value > current.value) {
			current.right = addRecursive(current.right, value);
		} else {
			// value already exists
			return current;
		}
		return current;
	}
	public void add(int value) {
	    root = addRecursive(root, value);
	}
	// search nodes
	private boolean containsNodeRecursive(Node current, int value) {
	    if (current == null) {
	        return false;
	    } 
	    if (value == current.value) {
	        return true;
	    } 
	    return value < current.value
	      ? containsNodeRecursive(current.left, value)
	      : containsNodeRecursive(current.right, value);
	}
	
	public boolean containsNode(int value) {
	    return containsNodeRecursive(root, value);
	}
	
	
}

class Node {
	int value = 0;
	Node right;
	Node left;

	public Node(int value) {
		this.value = value;
		this.right = null;
		this.left = null;
	}
}