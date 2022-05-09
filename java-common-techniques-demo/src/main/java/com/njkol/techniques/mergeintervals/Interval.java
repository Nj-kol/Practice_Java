package com.njkol.techniques.mergeintervals;

public class Interval {
	
	final int start;
	final int end;

	public Interval(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public String toString() {
		return "Interval [start=" + start + ", end=" + end + "]";
	}
}