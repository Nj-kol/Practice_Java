package com.njkol.bitwise.utils;

public class BitwiseUtils {

	public static int countNoOfBitsInANumber(int num) {

		// count number of total bits in 'num'
		int bitCount = 0;
		int n = num;
		while (n > 0) {
			bitCount++;
			n = n >> 1;
		}
		return bitCount;
	}

	public static int setAllBits(int num) {

		// for a number which is a complete power of '2' i.e., it can be written as  pow(2, n), if we
		// subtract '1' from such a number, we get a number which has 'n' least
		// significant bits set to '1'.
		// For example, '4' which is a complete power of '2', and '3' (which is one less
		// than 4) has a binary
		// representation of '11' i.e., it has '2' least significant bits set to '1'
		int all_bits_set = (int) Math.pow(2, countNoOfBitsInANumber(num)) - 1;
		return all_bits_set;
	}

	public static int bitwiseComplement(int num) {

		int all_bits_set = setAllBits(num);

		// from the solution description: complement = number ^ all_bits_set
		return num ^ all_bits_set;
	}

	public static void printBinaryString(int num) {

		System.out.println(Integer.toBinaryString(num));
	}
}
