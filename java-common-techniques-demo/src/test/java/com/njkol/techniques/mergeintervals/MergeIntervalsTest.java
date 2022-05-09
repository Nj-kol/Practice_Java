package com.njkol.techniques.mergeintervals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MergeIntervalsTest {

	List<Interval> input;
	@BeforeEach
	void setUp() throws Exception {
		 input = new ArrayList<Interval>();
	}

	@Test
	void testCase1() {
		input.add(new Interval(1, 4));
		input.add(new Interval(2, 5));
		input.add(new Interval(7, 9));
		for (Interval interval : MergeIntervals.merge(input))
			System.out.print("[" + interval.start + "," + interval.end + "] ");
		System.out.println("\n");
	}

	@Test
	void testCase2() {
		input.add(new Interval(6, 7));
		input.add(new Interval(2, 4));
		input.add(new Interval(5, 9));
		for (Interval interval : MergeIntervals.merge(input))
			System.out.print("[" + interval.start + "," + interval.end + "] ");
		System.out.println("\n");
	}
	
	@Test
	void testCase3() {
		input.add(new Interval(1, 4));
		input.add(new Interval(2, 6));
		input.add(new Interval(3, 5));
		for (Interval interval : MergeIntervals.merge(input))
			System.out.print("[" + interval.start + "," + interval.end + "] ");
		System.out.println("\n");
	}

}
