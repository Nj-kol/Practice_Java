package com.njkol.techniques.topk;

import java.util.*;

class Point {
	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int distFromOrigin() {
		// ignoring sqrt
		return (x * x) + (y * y);
	}
}

class KClosestPointsToOrigin {

	/**
	 * The time complexity of this algorithm is (N*logK) as we iterating all points
	 * and pushing them into the heap.
	 * 
	 * The space complexity will be O(K) because we need to store ‘K’ point in the
	 * heap.
	 *
	 * @param points
	 * @param k
	 * @return
	 */
	public static List<Point> findClosestPoints(Point[] points, int k) {

		PriorityQueue<Point> maxHeap = new PriorityQueue<>((p1, p2) -> p2.distFromOrigin() - p1.distFromOrigin());

		// put first 'k' points in the max heap
		for (int i = 0; i < k; i++)
			maxHeap.add(points[i]);

		// go through the remaining points of the input array, if a point is closer to
		// the origin than the top point
		// of the max-heap, remove the top point from heap and add the point from the
		// input array
		for (int i = k; i < points.length; i++) {
			if (points[i].distFromOrigin() < maxHeap.peek().distFromOrigin()) {
				maxHeap.poll();
				maxHeap.add(points[i]);
			}
		}

		// the heap has 'k' points closest to the origin, return them in a list
		return new ArrayList<>(maxHeap);
	}
}