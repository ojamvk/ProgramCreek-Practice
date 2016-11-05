package trees;

import java.util.*;

public class NaryTree {

	public static void main(String[] args) {

		TreeNode root = new TreeNode(10, new ArrayList<TreeNode>());
		TreeNode child1 = new TreeNode(20, new ArrayList<TreeNode>());
		TreeNode child2 = new TreeNode(30, new ArrayList<TreeNode>());
		root.children.add(child1);
		root.children.add(child2);
		System.out.println();
		System.out.println();
		for(TreeNode child: root.children)	{
			getMaxCumulativeValue(child);
			getCount(child);
		}
		
	}

	static int getMaxCumulativeValue(TreeNode node) {
		if (node.children == null) {
			return node.value;
		}
		for (TreeNode child : node.children) {
			node.value = node.value + getMaxCumulativeValue(child);
		}
		return node.value;
	}

	static int getCount(TreeNode node) {
		int count = 1;
		if (node.children == null) {
			return 1;
		} else {
			for (TreeNode child : node.children) {
				count += getCount(child);
			}
		}
		return count;
	}

}

class TreeNode {
	int value;
	ArrayList<TreeNode> children;

	TreeNode(int value, ArrayList<TreeNode> children) {
		this.value = value;
		this.children = children;
	}
}
