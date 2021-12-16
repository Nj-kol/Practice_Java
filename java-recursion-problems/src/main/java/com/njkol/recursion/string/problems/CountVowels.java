package com.njkol.recursion.string.problems;

public class CountVowels {

	public int totalVowels(String text, int len, int index) {
		
		int count = 0;

		if (len == 0) {
			return 0;
		}
		
		char single = Character.toUpperCase(text.charAt(index));
		
		if (single == 'A' || single == 'E' || single == 'I' || single == 'O' || single == 'U') {
			count++;
		}
		
		return count + totalVowels(text, len - 1, index + 1);
	}
}
