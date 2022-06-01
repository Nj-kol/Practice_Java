package com.njkol.bitwise.masking;

public class BitMaskingBasic {

	/**
	 * Note : The zeroth index starts from the end (i.e. rightmost)
	 * 
	 * @param number
	 * @param i
	 * @return
	 */
	public static boolean findithBit(int number, int i) {
		int mask = 1 << i;
		System.out.println("Mask is :"+Integer.toBinaryString(mask));
		return (number & mask) != 0;
	}

	/**
	 * Note : The zeroth index starts from the end (i.e. rightmost)
	 * 
	 * @param number
	 * @param i
	 * @return
	 */
	public static int setTheithBit(int number, int i) {
		int mask = 1 << i;
		System.out.println("Mask is :"+Integer.toBinaryString(mask));
		return number | mask;
	}

	/**
	 * Note : The zeroth index starts from the end (i.e. rightmost)
	 * 
	 * @param number
	 * @param i
	 * @return 
	 * @return
	 */
	public static int clearTheithBit(int number, int i) {
		int mask = ~ (1 << i);
		System.out.println("Mask is :"+Integer.toBinaryString(mask));
		return number & mask;
	}
}
