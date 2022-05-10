package com.njkol.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArraysDemo {

	public static void main(String[] args) {

		// int arr[] = { 3, 4 };
		int arr[] = { 3, 1, 5, 4, 2, 8 };

		scratchMethod(arr);
	}

	static public void scratchMethod(int[] arr) {

		List<String> list1 = new ArrayList<String>();
		Collections.addAll(list1, "one", "two", "three", "four","five");

		System.out.println(System.identityHashCode("one"));
		System.nanoTime();
		System.currentTimeMillis();
		
	}
}
