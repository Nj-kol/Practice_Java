package com.njkol.hashtable.algos;

import java.util.HashSet;
import java.util.Set;

/**
 * https://www.geeksforgeeks.org/longest-consecutive-subsequence/
 * https://www.techiedelight.com/find-longest-subsequence-formed-by-consecutive-integers/
 *
 */
public class LongestConsecutiveSubsequence {

	public static int findLongestConseqSubseq(int arr[], int n) {

		Set<Integer> S = new HashSet<>();

		for (int item : arr) {
			S.add(item);
		}

		 // initialize result by 0
        int maxLen = 0;
 
        // do for each element of the input sequence
        for (int e: arr)
        {
            // check if the current element `e` is a candidate for starting a sequence,
            // i.e., the previous element `e-1` doesn't exist in the set
            if (!S.contains(e - 1))
            {
                // `len` stores the length of subsequence, starting with the
                // current element
                int len = 1;
 
                // check for presence of elements `e+1`, `e+2`, `e+3`, … ,`e+len`
                // in the set
                while (S.contains(e + len)) {
                    len++;
                }
 
                // update result with the length of current consecutive subsequence
                maxLen = Math.max(maxLen, len);
            }
        }
 
		return maxLen;
	}
}
