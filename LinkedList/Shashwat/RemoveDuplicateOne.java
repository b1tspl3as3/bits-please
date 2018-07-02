public class RemoveDuplicateOne{

	public static ListNode removeDuplicate(ListNode head){
		if(head == null){
			return head;
		}

		ListNode current = head;
		while(current.next != null){
			if(current.val == current.next.val){
				current.next = current.next.next;
			}else{
				current = current.next;
			}
		}

		return head;
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