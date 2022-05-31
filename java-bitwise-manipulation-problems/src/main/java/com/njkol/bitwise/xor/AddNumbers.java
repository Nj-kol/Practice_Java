package com.njkol.bitwise.xor;

/**
 * https://www.youtube.com/watch?v=qq64FrA2UXQ
 * 
 * https://www.youtube.com/watch?v=kIXhc8nZKIo
 * 
 * @author Nilanjan
 *
 */
public class AddNumbers {

	public static int add(int a, int b) {
		int sum = a ^ b;
		int carry = a & b;
		if (carry == 0) {
			return sum;
		} else {
			return add(sum, carry << 1);
		}
	}
}
