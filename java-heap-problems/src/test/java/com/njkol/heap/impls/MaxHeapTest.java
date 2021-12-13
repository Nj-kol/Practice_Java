package com.njkol.heap.impls;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Disabled;
import org.junit.Before;
import org.junit.Test;

public class MaxHeapTest {

	private MaxHeap maxHeap;
	
	@Before
	public void setUp() throws Exception {
		maxHeap = new MaxHeap(10);
	}

	@Disabled
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
	

	@Test
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

}
