package com.njkol.hashtable.algos;

import java.util.HashMap;

/**
 *
 * https://www.geeksforgeeks.org/check-if-an-array-can-be-divided-into-pairs-whose-sum-is-divisible-by-k/
 * 
 * https://www.youtube.com/watch?v=toYgBIaUdfM
 * 
 */
public class Divisiblepair {
	
	/**
	 * Returns true if arr[0..n-1] can be divided into pairs  with sum divisible by k
	 * 
	 * @param ar
	 * @param k
	 * @return
	 */
	public static boolean canPairs(int ar[], int k) {
		
		// An odd length array cannot be divided into pairs
        if (ar.length % 2 == 1)
            return false;
 
        // Create a frequency array to count occurrences of all remainders when divided by k.
        HashMap<Integer, Integer> hm = new HashMap<>();
 
        // Count occurrences of all remainders
        for (int val : ar) {
            int rem = val % k;
            int of = hm.getOrDefault(rem,0);
            hm.put(rem, of + 1);
        }
 
        // Traverse input array and use freq[] to decide
        // if given array can be divided in pairs
        for (int val : ar) {
            // Remainder of current element
            int rem = val % k;
 
            // If remainder with current element divides k into two halves.
            if (2 * rem == k) {
                // Then there must be even occurrences of such remainder
                if (hm.get(rem) % 2 == 1)
                    return false;
            }
 
            // If remainder is 0, then there must be two elements with 0 remainder
            else if (rem == 0) {
                // Then there must be even occurrences of
                // such remainder
                if (hm.get(rem) % 2 == 1)
                    return false;
            }
 
            // Else number of occurrences of remainder must be equal to number of occurrences of  k - remainder
            else {
                if (hm.get(k - rem) != hm.get(rem))
                    return false;
            }
        }
        return true;
	}
}
