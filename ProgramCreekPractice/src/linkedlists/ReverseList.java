package linkedlists;

public class ReverseList {

	public static void main(String[] args) {

		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		//head.next.next.next.next = new Node(4);
		Node out = swapNodesInList(head);
		while(out != null)	{
			System.out.println(out.value);
			out = out.next;
		}
	}

	static Node reverseList(Node head)	{
		/*Node cur = head.next;
	    Node prev = head;
	    //prev.next = cur;
	    head.next = null;
	    while(cur !=null && prev != null)  {
	        //cur = prev.next;
	    	Node temp = cur.next;
	        cur.next = prev;
	        //prev.next = temp;
	        prev = cur;
	        cur = temp;
	    }
	    return prev;*/
		
		Node cur = head.next;
	    Node prev = head;
	    Node nex = head.next.next;
	    //prev.next = cur;
	    head.next = null;
	    while(nex!= null)  {
	        //cur = prev.next;
	    	nex = cur.next;
	        cur.next = prev;
	        //prev.next = nex;
	        prev = cur;
	        cur = nex;
	        
	    }
	    return prev;
	}
	
	static Node swapNodesInList(Node head)	{
		Node cur = head.next;
		Node prev = head;
		while(cur!= null)	{
		
			/*Node temp = cur.next;
			cur.next = prev;
			prev.next = temp;
			prev = prev.next;
			cur = prev.next;*/
			System.out.println("prev: "+ prev.value + " cur: "+ cur.value);
		}
				
		return head;
	}
}
