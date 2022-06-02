package com.njkol.techniques.topk;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class KClosestPointsToOriginTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testFindClosestPoints() {
		Point[] points = new Point[] { new Point(1, 3), new Point(3, 4), new Point(2, -1) };
		List<Point> result = KClosestPointsToOrigin.findClosestPoints(points, 2);
		System.out.print("Here are the k points closest the origin: ");
		for (Point p : result)
			System.out.print("[" + p.x + " , " + p.y + "] ");
	}
}
