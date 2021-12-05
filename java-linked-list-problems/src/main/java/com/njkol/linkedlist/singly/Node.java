package com.njkol.linkedlist.singly;

/**
 * 
 * @author Nilanjan Sarkar
 *
 * @param <T>
 */
public class Node<T> {

	public T data;
	private Node<T> next;

	public Node(T data) {
		this.data = data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
}
