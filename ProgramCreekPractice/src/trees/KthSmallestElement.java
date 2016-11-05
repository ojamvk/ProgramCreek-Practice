package trees;

import java.util.*;

public class KthSmallestElement {

	public static void main(String[] args) {

		Node root = new Node(30);
		root.left = new Node(28);
		root.right = new Node(33);
		root.left.left = new Node(25);
		root.left.right = new Node(29);
		root.right.left = new Node(31);
		root.right.right = new Node(35);
		System.out.println(getKthSmallestElement(root, 5).value);
	}

	static Node getKthSmallestElement(Node root, int k) {
		Stack<Node> stack = new Stack<Node>();
		Node n = root;
		while (n != null) {
			stack.push(n);
			n = n.left;
		}
		int i = 0;
		while (!stack.isEmpty()) {
			Node node = stack.pop();
			i++;
			if (i == k) {
				return node;
			}
			Node r = node.right;
			while (r != null) {
				stack.push(r);
				r = r.left;
			}
		}
		return null;
	}

}
