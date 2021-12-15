package com.njkol.recursion.problems;

/**
 * Factorial
 * 
 * @author Nilanjan Sarkar
 *
 */
public class Factorial {

	public int recursiveFactorial(int num) {

		// Base case
		if (num == 0) {
			return 1;
		}

		return num * recursiveFactorial(num - 1);
	}

	public int iterativeFactorial(int num) {

		if (num == 0) {
			return 1;
		}

		int factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial *= i;
		}

		return factorial;
	}
}
