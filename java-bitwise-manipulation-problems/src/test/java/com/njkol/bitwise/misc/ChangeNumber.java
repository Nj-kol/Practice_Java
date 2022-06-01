package com.njkol.bitwise.misc;

/**
 * 
 * Find the number of bits to change to convert a to b
 *
 */
public class ChangeNumber {

	public static int numBitsToChange(int a, int b) {

		int n = a ^ b;
		System.out.println(Integer.toBinaryString(n));
		int count = 0;
		while (n > 0) {
			n = n & (n - 1);
			count++;
		}
		return count;
	}
}
