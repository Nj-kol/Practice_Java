package com.njkol.techniques.fastandslowpointers;

class ListNode {
	int value = 0;
	ListNode next;

	ListNode(int value) {
		this.value = value;
	}
}

public class LinkedListCycle {

	public boolean hasCycle(ListNode head) {

		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (slow == fast)
				return true; // found the cycle
		}
		return false;
	}
	

	public boolean hasCyclev2(ListNode head) {

		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (slow == fast)
				return true; // found the cycle
		}
		return false;
	}
}
