package com.njkol.recursion.problems;

/**
 * What is a prime number?
 * 
 * A prime number is a number greater than 1 that has only two divisors: 1 and
 * the number itself. The first few prime numbers are
 * 
 * 2,3,5,7,11,13,17,19,23,29,.....
 * 
 * The numbers 1 and 0 are neither prime nor composite.
 * 
 * @author Nilanjan Sarkar
 *
 */
public class PrimeNumber {

	public  boolean isPrime(int num, int i) {
		
		// First base case
		if (num < 2) {
			return false;
		}
		
		// Second base case
		else if (i == 1) {
			return true;
		}
		
		// Third base case
		else if (num % i == 0) {
			return false;
		}
		
		// Recursive case
		else {
			return isPrime(num, i - 1);
		}
	}
}
