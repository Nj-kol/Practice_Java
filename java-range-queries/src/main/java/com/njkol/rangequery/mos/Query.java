package com.njkol.rangequery.mos;

class Query implements Comparable<Query> {

	private int index;
	private int blocksize;
	
	int left;
	int right;

	public Query(final int left, final int right) {
		this.left = left;
		this.right = right;
	}

	public void setBlocksize(int blocksize) {
		this.blocksize = blocksize;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getIndex() {
		return index;
	}

	@Override
	public int compareTo(final Query other) {

		int leftBlockIndex = left / blocksize;
		int otherLeftBlockIndex = other.left / blocksize;

		if (leftBlockIndex - otherLeftBlockIndex != 0) {
			return leftBlockIndex - otherLeftBlockIndex;
		} else {
			return right - other.right;
		}
	}

	@Override
	public String toString() {
		return "Query{" + "index=" + index + ", left=" + left + ", right=" + right + '}';
	}
}