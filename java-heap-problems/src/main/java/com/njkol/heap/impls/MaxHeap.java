package com.njkol.heap.impls;

/**
 * 
 * @author Nilanjan Sarkar
 * 
 *         https://www.geeksforgeeks.org/max-heap-in-java/
 *
 */
public class MaxHeap {

	private int[] heap;
	private int size;

	public MaxHeap(int capacity) {
		heap = new int[capacity];
	}

	public void insert(int value) {

		if (isFull()) {
			throw new IndexOutOfBoundsException("Heap is full");
		}

		heap[size] = value;

		fixHeapAbove(size);

		// Advance the position to an empty location
		size++;
	}

	public int peek() {
		if (isEmpty()) {
			throw new IndexOutOfBoundsException("Heap is empty");
		}

		return heap[0];
	}

	public int delete(int index) {
		if (isEmpty()) {
			throw new IndexOutOfBoundsException("Heap is empty");
		}

		int parent = getParent(index);
		int deletedValue = heap[index];

		heap[index] = heap[size - 1];

		if (index == 0 || heap[index] < heap[parent]) {
			fixHeapBelow(index, size - 1);
		} else {
			fixHeapAbove(index);
		}

		size--;

		return deletedValue;
	}

	public void sort() {
		int lastHeapIndex = size - 1;
		for (int i = 0; i < lastHeapIndex; i++) {
			int tmp = heap[0];
			heap[0] = heap[lastHeapIndex - i];
			heap[lastHeapIndex - i] = tmp;

			fixHeapBelow(0, lastHeapIndex - i - 1);
		}
	}

	private void fixHeapAbove(int index) {

		int newValue = heap[index];

		while (index > 0 && newValue > heap[getParent(index)]) {

			// Down the parent down which are less than the new
			heap[index] = heap[getParent(index)];
			index = getParent(index);
		}

		// final assign the new value to the empty parent slot
		heap[index] = newValue;
	}

	private void fixHeapBelow(int index, int lastHeapIndex) {
		int childToSwap;

		while (index <= lastHeapIndex) {
			int leftChild = getLeftChild(index);
			int rightChild = getRightChild(index);
			if (leftChild <= lastHeapIndex) {
				if (rightChild > lastHeapIndex) {
					childToSwap = leftChild;
				} else {
					childToSwap = (heap[leftChild] > heap[rightChild] ? leftChild : rightChild);
				}

				if (heap[index] < heap[childToSwap]) {
					int tmp = heap[index];
					heap[index] = heap[childToSwap];
					heap[childToSwap] = tmp;
				} else {
					break;
				}

				index = childToSwap;
			} else {
				break;
			}
		}
	}

	public boolean isFull() {
		return size == heap.length;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int getParent(int index) {

		// no need to use floor, as it will be rounded down
		return (index - 1) / 2;
	}

	// Returning left children of a node at the position requested
	public int getLeftChild(int index) {
		return (2 * index) + 1;
	}

	// Returning right children of a node at the position requested
	public int getRightChild(int index) {
		return (2 * index) + 2;
	}

	public void print() {
		for (int i = 0; i <= (size / 2) - 1; i++) {
			System.out.print(
					" PARENT : " + heap[i] + " LEFT CHILD : " + heap[2 * i + 1] + " RIGHT CHILD :" + heap[2 * i + 2]);
			System.out.println();
		}
	}

	public void printHeapArray() {
		for (int i = 0; i < size; i++) {
			System.out.print(heap[i]);
			System.out.print(", ");
		}
		System.out.println();
	}

}