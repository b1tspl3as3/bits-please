public class LinkedList{

	static class ListNode{

		int val;
		ListNode next;

		ListNode(int val){
			this.val  = val;
			this.next = null;
		}
	}

	// default constructor
	LinkedList(){

	}

	public ListNode add(ListNode head, int val){
		if(head == null){
			return new ListNode(val);
		}

		ListNode newNode = new ListNode(val);
		newNode.next = head;
		head = newNode;

		return head;
	}

	public ListNode reverse(ListNode head){

		if(head == null){
			return null;
		}

		ListNode current = head;
		ListNode next    = null;
		ListNode prev    = null;

		while(current != null){
			next = current.next;
			current.next = prev;
			prev         = current;
			current      = next;
			
		}

		return prev;

	}

	public void printLL(ListNode head){
		if(head == null){
			System.out.println("EMPTY LIST");
		}

		ListNode current = head;
		while(current != null){
			System.out.print(current.val+"->");
			current = current.next;
		}
	}


	public static void main(String [] args){
		LinkedList ll = new LinkedList();
		ListNode head = null;
	    head = ll.add(head, 1);
	    head = ll.add(head, 2);
	    head = ll.add(head, 3);
	    head = ll.add(head, 4);


	    ll.printLL(head);
	    ListNode prev = ll.reverse(head);
	    System.out.println();
	    ll.printLL(prev);

	}

}