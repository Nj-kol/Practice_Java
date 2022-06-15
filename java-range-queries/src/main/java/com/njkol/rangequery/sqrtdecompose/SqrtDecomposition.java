package com.njkol.rangequery.sqrtdecompose;

/**
 * https://github.com/gkcs/Competitive-Programming/blob/master/src/main/java/main/java/videos/SqrtDecomposition.java
 * 
 * https://www.geeksforgeeks.org/sqrt-square-root-decomposition-technique-set-1-introduction/
 * 
 * https://jojozhuang.github.io/algorithm/algorithm-sqrt-decomposition/
 * 
 * @author Nilanjan
 *
 */
import java.util.Arrays;

/**
 * Square root decomposition allows us to answer queries in sqrt(N) time. As the
 * implementation of these structures is usually simpler than a segment tree,
 * they are a useful tool in a programmer's arsenal.
 */
public class SqrtDecomposition {

	private  int arr[];
	private long blockSums[];
	private int blockSize;

	public SqrtDecomposition(int input[]) {
	    preprocess(input);
	}

	private void preprocess(int input[]) {

		// size of array
		int n = input.length;
		
		// calculating size of block
		blockSize = (int) Math.ceil(Math.sqrt(n));

		// original array
		arr = new int[n];

		blockSums = new long[blockSize];
		
		// initiating block pointer
		int blk_idx = -1;

		// building the decomposed array
		for (int i = 0; i < n; i++) {
			arr[i] = input[i];
			if (i % blockSize == 0) {
				// entering next block
				// incrementing block pointer
				blk_idx++;
			}
			blockSums[blk_idx] += arr[i];
		}
	}

	/**
	 * Time Complexity : O(1)
	 * 
	 * @param index The index to be updated
	 * @param value The value to set the element at specified index
	 */
	public void update(int index, int value) {
		
		// Find the block number where the update belongs to wrt the original array
		int blockNumber = index / blockSize;
		
		// Update the result of the block. Here we are just updating the sum, thus we remove the old value from the sum and add the new element
		blockSums[blockNumber] = blockSums[blockNumber] - arr[index] + value;
		
		// Finally update the value in the original array
		arr[index] = value;
	}

	/**
	 * @param left  The stating index.
	 * @param right The ending index.
	 * @return The sum from index left to right
	 */
	public long query(final int left, final int right) {
		
		// start block where the left most index belongs to
	    int startBlockIndex = left / blockSize;
	    
		// end block where the right most index belongs to
	    int endBlockIndex = right / blockSize;
		
		long sum = 0;
		
		// left non-overlap
		int lastIndexOfStartBlock = startBlockIndex * blockSize;
	    int startIndex = left % blockSize;
	    
		for (int i = startIndex; i < blockSize; i++) {
			sum += arr[lastIndexOfStartBlock + i];
		}
		
		 // overlap
		for (int i = startBlockIndex + 1; i < endBlockIndex; i++) {
			sum += blockSums[i];
		}
		
		// right non-overlap
		int firstIndexOfEndBlock = endBlockIndex * blockSize;
	    int endIndex = right % blockSize;
		for (int i = 0; i <= endIndex; i++) {
			sum += arr[firstIndexOfEndBlock + i];
		}
		
		return sum;
	}

	@Override
	public String toString() {
		return "SqrtDecomposition{\n" + "a=" + Arrays.toString(arr) + ",\n blockSums=" + Arrays.toString(blockSums) + '}';
	}
}