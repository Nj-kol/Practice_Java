package com.njkol.techniques.inplacelinkedlistreversal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseLinkedListTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testReverse() {
	    ListNode head = new ListNode(2);
	    head.next = new ListNode(4);
	    head.next.next = new ListNode(6);
	    head.next.next.next = new ListNode(8);
	    head.next.next.next.next = new ListNode(10);

	    ListNode result = ReverseLinkedList.reverse(head);
	    System.out.print("Nodes of the reversed LinkedList are: ");
	    while (result != null) {
	      System.out.print(result.value + " ");
	      result = result.next;
	    }
	  }
}
