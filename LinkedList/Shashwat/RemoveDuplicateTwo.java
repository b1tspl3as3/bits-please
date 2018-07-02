public class RemoveDuplicateTwo{
	public static ListNode removeDuplicate(ListNode head){
		if(head == null){
			return head;
		}

		ListNode preHead = new ListNode(-1);
		preHead.next     = head;
		head             = preHead;

		ListNode traversalPtr = preHead;

		while(traversalPtr.next != null){
			ListNode p = traversalPtr.next;
			while(p.next != null && p.val == p.next.val){
				p = p.next;
			}

			if(traversalPtr.next != p){
				traversalPtr.next = p.next;
			}else{
				traversalPtr = traversalPtr.next;
			}
		}

		return head.next;
	}

	public static void main(String [] args){
		LinkedList ll = new LinkedList();
		ListNode head = null;

		head  = ll.add(head, 5);
		head  = ll.add(head, 4);
		head  = ll.add(head, 3);
		head  = ll.add(head, 3);
		head  = ll.add(head, 2);
		head  = ll.add(head, 2);
		head  = ll.add(head, 1);

		ListNode newHead = removeDuplicate(head);
		ll.printLL(newHead);
	}
}