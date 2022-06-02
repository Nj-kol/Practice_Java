package com.njkol.techniques.topk;

import java.util.PriorityQueue;

public class KthSmallestNumber {

	/**
	 * The time complexity of this algorithm is O(K*logK + (N-K)*logK) , which is asymptotically equal to O(N*logK)
	 * 
     * The space complexity will be O(K) because we need to store ‘K’ smallest numbers in the heap
     * 
	 * @param nums
	 * @param k
	 * @return
	 */
	public static int findKthSmallestNumber(int[] nums, int k) {

	    PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>((n1, n2) -> n2 - n1);
	    
	    // put first k numbers in the max heap
	    for (int i = 0; i < k; i++)
	      maxHeap.add(nums[i]);

	    // go through the remaining numbers of the array, if the number from the array is smaller than the
	    // top (biggest) number of the heap, remove the top number from heap and add the number from array
	    for (int i = k; i < nums.length; i++) {
	      if (nums[i] < maxHeap.peek()) {
	        maxHeap.poll();
	        maxHeap.add(nums[i]);
	      }
	    }

	    // the root of the heap has the Kth smallest number. Since the heap will only contain the k smallest elements now
	    return maxHeap.peek();
	}

	/**
	 * 
     * Initializing the min-heap with all numbers will take O(N) and extracting ‘K’ numbers will take O(KlogN)
     * Overall, the time complexity of this algorithm will be O(N+KlogN) and the space complexity will be O(N)

	 * @param nums
	 * @param k
	 * @return
	 */
	public static int findKthSmallestNumberAlter(int[] nums, int k) {

		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>((n1, n2) -> n1 - n2);

		for (int e : nums) {
			minHeap.add(e);
		}

		int smallest = 0;
		while (k != 0) {
			smallest = minHeap.poll();
			k--;
		}
		return smallest;
	}
}