package com.greatlearning.que2;

import java.util.ArrayList;
import java.util.List;

class Node {
	int key;
	Node left;
	Node right;
	
	 public Node (int data)
		{
			this.key=data;
			this.left=null;
			this.right=null;
		}		
	}


public class BinarySearchTree {
	Node root;
	public BinarySearchTree(){
		root=null;
	}
	
	public BinarySearchTree(int data){
		root=new Node(data);
	}
	
	
	void insert(int key) {
		
		root = insertRec(root,key);
	}
	
	
	 Node insertRec(Node root,int key)
	{
		 
		 if(root==null)
		 {
			 root= new Node(key);
			 return root; 
		 }
		 else if (key<root.key)
		 {
			 root.left=insertRec(root.left,key);
		 }
		 else if (key>root.key)
		 {
			 root.right=insertRec(root.right,key);
		 }
		 else {
			 System.out.println("Value alredy present");
		 }
		 
		 return root;
	}
	 
	 void inOrder ()
	 {
		 inOrderRec(this.root); 
		 
	 }
	
	 void inOrderRec(Node root)
	{
		if(root==null)
			return;
		else {
			inOrderRec(root.left);
			System.out.print(root.key+" ");
			inOrderRec(root.right);
		}
	}
	 
	

}
