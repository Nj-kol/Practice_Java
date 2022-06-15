package com.njkol.techniques.twoheaps;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MedianOfAStreamTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testFindMedian() {
		MedianOfAStream medianOfAStream = new MedianOfAStream();
		medianOfAStream.insertNum(3);
		medianOfAStream.insertNum(1);
		System.out.println("The median is: " + medianOfAStream.findMedian());
		medianOfAStream.insertNum(5);
		System.out.println("The median is: " + medianOfAStream.findMedian());
		medianOfAStream.insertNum(4);
		System.out.println("The median is: " + medianOfAStream.findMedian());
	}
}
