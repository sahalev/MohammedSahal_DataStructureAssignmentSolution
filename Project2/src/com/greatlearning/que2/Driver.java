package com.greatlearning.que2;

import java.util.List;

public class Driver {

	public static void main(String[] args) {
		
		
		BinarySearchTree bt = new BinarySearchTree();
		bt.insert(50);
		bt.insert(30);
		bt.insert(60);
		bt.insert(10);
		bt.insert(55);
		
		bt.inOrder();
		
		System.out.println();
		RightSkewedTree rst = new RightSkewedTree();
	
		
		
		System.out.println();
		//Traversing right before right skew
		rst.transverseRightSkewedTree(bt.root);
		
		System.out.println();
		
		Node rightSkewedTree = rst.rightSkewedBT(bt.root);
		rst.transverseRightSkewedTree(rightSkewedTree);
	}

}
