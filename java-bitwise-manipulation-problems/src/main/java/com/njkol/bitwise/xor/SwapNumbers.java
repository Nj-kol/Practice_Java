package com.njkol.bitwise.xor;

public class SwapNumbers {

	public static void swap(int a, int b) {

		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		System.out.println("a=" + a + " " + "b=" + b);
	}
}
