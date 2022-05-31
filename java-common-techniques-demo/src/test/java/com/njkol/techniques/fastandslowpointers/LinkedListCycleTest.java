package com.njkol.techniques.fastandslowpointers;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.ListIterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LinkedListCycleTest {

	LinkedListCycle prob;

	@BeforeEach
	void setUp() throws Exception {
		prob = new LinkedListCycle();
	}

	@Test
	void testCase1() {

		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(6);

		System.out.println("LinkedList has cycle: " + prob.hasCycle(head));

		head.next.next.next.next.next.next = head.next.next;
		System.out.println("LinkedList has cycle: " + prob.hasCycle(head));

		head.next.next.next.next.next.next = head.next.next.next;
		System.out.println("LinkedList has cycle: " + prob.hasCycle(head));
	}

}
