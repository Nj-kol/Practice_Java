package com.njkol.techniques.mergeintervals;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class MergeIntervals {

	public static List<Interval> merge(List<Interval> intervals) {

		if (intervals.size() < 2)
			return intervals;

		// sort the intervals by start time
		Collections.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));

		System.out.println("After sorting");
		intervals.forEach(System.out::println);

		List<Interval> mergedIntervals = new LinkedList<Interval>();
		
		ListIterator<Interval> intervalItr = intervals.listIterator();
		Interval prev = intervalItr.next();
		int start = prev.start;
		int end = prev.end;

		while (intervalItr.hasNext()) {
			Interval next = intervalItr.next();
			if (next.start <= end) { // overlapping intervals, adjust the 'end'
				end = Math.max(next.end, end);
			} else { // non-overlapping interval, add the previous interval and reset
				mergedIntervals.add(new Interval(start, end));
				start = next.start;
				end = next.end;
			}
		}
		// add the last interval
		mergedIntervals.add(new Interval(start, end));

		return mergedIntervals;

	}
}
