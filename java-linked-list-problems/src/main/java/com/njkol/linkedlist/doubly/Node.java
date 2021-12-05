package com.njkol.linkedlist.doubly;

/**
 * 
 * @author Nilanjan Sarkar
 *
 * @param <T>
 */
public class Node<T> {

	public T data;
	private Node<T> next;
	private Node<T> previous;

	public Node(T data) {
		this.data = data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public Node<T> getPrevious() {
		return previous;
	}

	public void setPrevious(Node<T> previous) {
		this.previous = previous;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
}