package com.njkol.techniques.slidingwindow;

import java.util.*;

/**
 * Longest Substring with maximum K Distinct Characters
 * 
 * Given a string, find the length of the longest substring in it with no more
 * than K distinct characters.
 * 
 * @author Nilanjan
 *
 */
public class LongestSubstringKDistinct {

	public static int findLength(String str, int k) {
		
		if (str == null || str.length() == 0)
			throw new IllegalArgumentException();

		Map<Character, Integer> charFrequencyMap = new HashMap<>();
	
		int windowStart = 0;
		int maxLength = 0;
		
		// in the following loop we'll try to extend the range [windowStart, windowEnd]
		for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
			
			char rightChar = str.charAt(windowEnd);
			
			// If a character does not exist, initialize it and increment it
			charFrequencyMap.put(rightChar, charFrequencyMap.getOrDefault(rightChar, 0) + 1);
			
			// shrink the sliding window, until we are left with 'k' distinct characters in the frequency map
			boolean isConditionBreached = charFrequencyMap.size() > k;
			while (isConditionBreached) {
				char leftChar = str.charAt(windowStart);
				charFrequencyMap.put(leftChar, charFrequencyMap.get(leftChar) - 1);
				if (charFrequencyMap.get(leftChar) == 0) {
					charFrequencyMap.remove(leftChar);
				}
				windowStart++; // shrink the window
			}
			maxLength = Math.max(maxLength, windowEnd - windowStart + 1); // remember the maximum length so far
		}

		return maxLength;
	}

}