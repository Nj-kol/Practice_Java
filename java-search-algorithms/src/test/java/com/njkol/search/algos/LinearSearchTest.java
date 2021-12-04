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
 *
 */
class LinearSearchTest {

	private SearchAlgorithm sa;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp(TestInfo ti, TestReporter tr) throws Exception {
		sa = new LinearSearch();
	}

	@ParameterizedTest
	@MethodSource("provideExistingElements")
	@DisplayName("Test find element if exists")
	void testFound(int[] intArray, int input, int expected) {
		int actual = sa.doIntegerSearch(intArray, input);
		assertEquals(expected, actual, "Search should return correct index if found in the array");
	}

	@ParameterizedTest
	@MethodSource("provideNonExistingElements")
	@DisplayName("Test find element if NOT exists")
	void testNotFound(int[] intArray, int input, int expected) {
		int actual = sa.doIntegerSearch(intArray, input);
		assertEquals(expected, actual, "Search should return -1 if element is NOT found in the array");
	}

	@SuppressWarnings("unused")
	private static Stream<Arguments> provideExistingElements() {

		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
		return Stream.of(Arguments.of(intArray, -15, 2), Arguments.of(intArray, 1, 5), Arguments.of(intArray, -22, 6));
	}

	@SuppressWarnings("unused")
	private static Stream<Arguments> provideNonExistingElements() {

		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
		return Stream.of(Arguments.of(intArray, 8888, -1), Arguments.of(intArray, -34, -1),
				Arguments.of(intArray, -490, -1));
	}
}