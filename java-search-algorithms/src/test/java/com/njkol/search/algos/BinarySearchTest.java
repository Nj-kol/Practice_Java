/**
 * 
 */
package com.njkol.search.algos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * @author Nilanjan Sarkar
 */
class BinarySearchTest {

	private SearchAlgorithm sa;

	@ParameterizedTest
	@MethodSource("provideExistingElements")
	@DisplayName("Binary Search Iterative : Test find element if exists")
	void testFoundForIterative(int[] intArray, int input, int expected) {
		sa = new BinarySearch("I");
		int actual = sa.doIntegerSearch(intArray, input);
		assertEquals(expected, actual, "Search should return correct index if found in the array");
	}

	@ParameterizedTest
	@MethodSource("provideExistingElements")
	@DisplayName("Binary Search Recursive : Test find element if exists")
	void testFoundForRecursive(int[] intArray, int input, int expected) {
		sa = new BinarySearch("R");
		int actual = sa.doIntegerSearch(intArray, input);
		assertEquals(expected, actual, "Search should return correct index if found in the array");
	}
	
	@ParameterizedTest
	@MethodSource("provideNonExistingElements")
	@DisplayName("Binary Search Iterative : Test find element if NOT exists")
	void testNotFoundForIterative(int[] intArray, int input, int expected) {
		sa = new BinarySearch("I");
		int actual = sa.doIntegerSearch(intArray, input);
		assertEquals(expected, actual, "Search should return -1 if element is NOT found in the array");
	}
	
	@ParameterizedTest
	@MethodSource("provideNonExistingElements")
	@DisplayName("Binary Search Recursive : Test find element if NOT exists")
	void testNotFoundForRecursive(int[] intArray, int input, int expected) {
		sa = new BinarySearch("R");
		int actual = sa.doIntegerSearch(intArray, input);
		assertEquals(expected, actual, "Search should return -1 if element is NOT found in the array");
	}

	@SuppressWarnings("unused")
	private static Stream<Arguments> provideExistingElements() {
		int[] intArray = { -22, -15, 1, 7, 20, 35, 55 };
		return Stream.of(Arguments.of(intArray, -15, 1), Arguments.of(intArray, 1, 2), Arguments.of(intArray, -22, 0));
	}

	@SuppressWarnings("unused")
	private static Stream<Arguments> provideNonExistingElements() {
		int[] intArray = { -22, -15, 1, 7, 20, 35, 55 };
		return Stream.of(Arguments.of(intArray, 8888, -1), Arguments.of(intArray, -34, -1),
				Arguments.of(intArray, -490, -1));
	}
}