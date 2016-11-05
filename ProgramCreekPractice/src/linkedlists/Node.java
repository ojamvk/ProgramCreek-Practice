package linkedlists;

public class Node {

	int key;
	int value;
	Node next;
	Node prev;
	Node random;
	public Node(int value)	{
		this.value = value;
		this.next = null;
	}
	
	public Node(int key, int value)	{
		this.key = key;
		this.value = value;
	}
}
