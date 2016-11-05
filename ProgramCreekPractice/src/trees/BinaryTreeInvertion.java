package trees;

import java.util.*;
public class BinaryTreeInvertion {

	public static void main(String[] args) {
		Node root = new Node(5);
		//Node root = null;
		Node invertedRoot = invertBinaryTree(root);
		Node node = invertedRoot;
		
	}

	static Node invertBinaryTreeRecursion(Node root)	{
		if(Utility.isNull(root))	{
			throw new NullPointerException("Node has a null value!");
		}
		Node temp = root.left;
		root.left = root.right;
		root.right = temp;
		if(!Utility.isNull(root.left))	{
			return invertBinaryTreeRecursion(root.left);
		}
		if(!Utility.isNull(root.right))	{
			return invertBinaryTreeRecursion(root.right);
		}
		return root;
	}
	
	static Node invertBinaryTree(Node root)	{
		if(Utility.isNull(root))	{
			throw new NullPointerException("Node has a null value!");
		}
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty())	{
			Node node = queue.remove();
			if(node.right != null)	{
				queue.add(node.right);
			}
			if(node.left != null)	{
				queue.add(node.left);
			}
			Node temp = node.left;
			node.left = node.right;
			node.right = temp;
		}
		return root;
	}
}
