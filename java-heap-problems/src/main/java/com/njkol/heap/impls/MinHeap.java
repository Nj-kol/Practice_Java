package com.njkol.heap.impls;

public class MinHeap {

	private int[] heap;
	private int size;

	public MinHeap(int capacity) {
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
	
	private void fixHeapAbove(int index) {

		int newValue = heap[index];

		while (index > 0 && newValue < heap[getParent(index)]) {
			// bubble Down the parent down which are less than the new
			heap[index] = heap[getParent(index)];
			index = getParent(index);
		}

		// final assign the new value to the empty parent slot
		heap[index] = newValue;
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