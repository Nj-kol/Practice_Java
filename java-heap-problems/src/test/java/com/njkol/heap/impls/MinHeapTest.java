package com.njkol.heap.impls;

import java.util.PriorityQueue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MinHeapTest {

	private MinHeap minHeap;

	@BeforeEach
	public void setUp() throws Exception {
		minHeap = new MinHeap(10);
	}
	@Test
	void test() {
		// Custom inputs
		minHeap.insert(5);
		minHeap.insert(3);
		minHeap.insert(17);
		minHeap.insert(10);
		minHeap.insert(84);
		minHeap.insert(19);
		minHeap.insert(6);
		minHeap.insert(22);
		minHeap.insert(9);
		minHeap.print();
	}
	

	@Test
	public void testPriorityQueueAsMinHeap() {
	
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>((n1, n2) -> n1 - n2);

		minHeap.add(5);
		minHeap.add(3);
		minHeap.add(17);
		minHeap.add(10);
		minHeap.add(84);
		minHeap.add(19);
		minHeap.add(6);
		minHeap.add(22);
		minHeap.add(9);

		Object[] e = minHeap.toArray();

		for (int i = 0; i <= (e.length / 2) - 1; i++) {
			System.out.print(" PARENT : " + e[i] + " LEFT CHILD : " + e[2 * i + 1] + " RIGHT CHILD :" + e[2 * i + 2]);
			System.out.println();
		}
	}
}
