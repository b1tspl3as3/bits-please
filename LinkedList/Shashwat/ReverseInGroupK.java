public class ReverseInGroupK{

	private static ListNode reverseInGroup(ListNode head, int k){
		ListNode curr = head;
		int count     = 0;

		while(curr != null && count != k){
			curr = curr.next;
			count++;
		}

		if(count == k){
			ListNode current = head;
			ListNode next    = null;
			ListNode prev    = null;

			while(count > 0 && current.next != null){
				next         = current.next;
   				current.next = prev;
   				prev         = current;
   				current      = next;
   				count--;
			}

			if(next != null){
				head.next = reverseInGroup(next, k);
			}

			head = prev;
		}

		return head;
	}

	public static void main(String [] args){
		LinkedList ll = new LinkedList();
		ListNode head = null;

		head  = ll.add(head, 7);
		head  = ll.add(head, 6);
		head  = ll.add(head, 5);
		head  = ll.add(head, 4);
		head  = ll.add(head, 3);
		head  = ll.add(head, 2);
		head  = ll.add(head, 1);

		int k = 2;
		ListNode newHead = reverseInGroup(head, k);
		ll.printLL(newHead);
	}
}
