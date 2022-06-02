package com.njkol.heap.impls;

import java.util.PriorityQueue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class MaxHeapTest {

	private MaxHeap maxHeap;

	@BeforeEach
	public void setUp() throws Exception {
		maxHeap = new MaxHeap(9);
	}

	// @Disabled
	// @Test
	public void testInsert() {
		// Custom inputs
		maxHeap.insert(5);
		maxHeap.insert(3);
		maxHeap.insert(17);
		maxHeap.insert(10);
		maxHeap.insert(84);
		maxHeap.insert(19);
		maxHeap.insert(6);
		maxHeap.insert(22);
		maxHeap.insert(9);

		maxHeap.print();
	}

	// @Test
	public void testSort() {
		// Custom inputs
		maxHeap.insert(5);
		maxHeap.insert(3);
		maxHeap.insert(17);
		maxHeap.insert(10);
		maxHeap.insert(84);
		maxHeap.insert(19);
		maxHeap.insert(6);
		maxHeap.insert(22);
		maxHeap.insert(9);
		maxHeap.sort();

		maxHeap.printHeapArray();
	}

	@Test
	public void testPriorityQueueAsMaxHeap() {
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>((n1, n2) -> n2 - n1);

		maxHeap.add(5);
		maxHeap.add(3);
		maxHeap.add(17);
		maxHeap.add(10);
		maxHeap.add(84);
		maxHeap.add(19);
		maxHeap.add(6);
		maxHeap.add(22);
		maxHeap.add(9);

		Object[] e = maxHeap.toArray();

		for (int i = 0; i <= (e.length / 2) - 1; i++) {
			System.out.print(" PARENT : " + e[i] + " LEFT CHILD : " + e[2 * i + 1] + " RIGHT CHILD :" + e[2 * i + 2]);
			System.out.println();
		}
	}
}
