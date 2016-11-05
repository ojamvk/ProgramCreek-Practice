package linkedlists;

public class ReorderList {

	public static void main(String[] args) {

		Node head = new Node(0);
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		head.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		
		Node n = reorderList(head);
		while(n!= null)	{
			System.out.println(n.value);
			n = n.next;
		}
	}

	static Node reorderList(Node head) {
		Node n = head;
		Node s = head;
		Node runner = head;
		Node out = head;
		while (runner != null) {
			n = n.next;
			runner = runner.next.next;
		}
		//System.out.println(n.next.value);
		Node second = reverseList(n.next);
		n.next = null;
		Node e = second;
		while(s!= null && e!= null)	{
			Node temp1 = s;
			Node temp2 = e;
			s = s.next;
			e = e.next;
			temp1.next = temp2;
			temp2.next = s;
		}
		
		return head;
	}
	
	static Node reverseList(Node head)	{
		Node cur = head.next;
		Node prev = head;
		head.next = null;
		while(cur!= null)	{
			Node temp = cur.next;
			cur.next = prev;
			prev = cur;
			cur = temp;
		}
		return prev;
	}
}
