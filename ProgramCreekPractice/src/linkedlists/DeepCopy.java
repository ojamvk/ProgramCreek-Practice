package linkedlists;

public class DeepCopy {

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

		Node out = deepCopyLinkedList(head);
		while (out != null) {
			System.out.println(out.value);
			out = out.next;
		}
	}

	static Node deepCopyLinkedList(Node head) {
		Node n = head;
		// Copy values into new linked list
		while (n != null) {
			Node copy = new Node(n.value);
			copy.next = n.next;
			n.next = copy;
			n = copy.next;
		}

		n = head;
		// copy = head.next;
		while (n != null) {
			if (n.random != null) {
				n.next.random = n.random.next;
			}
			n = n.next.next;
		}

		n = head;
		Node newHead = head.next;

		while (n != null && n.next != null) {

			Node copy = n.next;
			n.next = copy.next;
			if (copy.next != null)
				copy.next = copy.next.next;
			n = n.next;
		}

		return newHead;
	}
}
