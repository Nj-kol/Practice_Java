package com.njkol.bitwise.and;

public class EvenOdd {

	public static boolean isEven(int num) {
		if ((num & 1) == 0)
			return true;
		else
			return false;
	}
}
