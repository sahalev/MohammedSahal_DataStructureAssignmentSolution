package com.greatlearning.que2;

public class RightSkewedTree {
	
	    static Node prevNode = null;
	    static Node headNode = null;
	
	
	 void transverseRightSkewedTree(Node root)
	{
		if(root==null)
			return;
		System.out.print(root.key+" ->");
		transverseRightSkewedTree(root.right);
	}
	
	 
	 // This method returns the right skewed tree
	 Node  rightSkewedBT(Node root) {
		
		 // Base Case
        if(root == null)
        {
            return headNode;
        }	
        
        rightSkewedBT(root.left);
        
        Node rightNode = root.right;
        Node leftNode = root.left;
        
        if(headNode == null)
        {
            headNode = root;
            root.left = null;
            prevNode = root;
        }
        else
        {
            prevNode.right = root;
            root.left = null;
            prevNode = root;
        }
        
        rightSkewedBT(rightNode);
        
        return headNode;
        
	}

}
