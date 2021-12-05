package com.njkol.linkedlist.doubly;

import com.njkol.linkedlist.doubly.Node;

/**
 * 
 * @author Nilanjan Sarkar
 *
 * @param <T>
 */
public class DoublyLinkedList<T> {

	private Node<T> head;
	private Node<T> tail;
	private int size;

	public void addToFront(T data) {
		Node<T> node = new Node<T>(data);
		// If the list is empty
		if (head == null) {
			// No need to explicitly set the head to empty
			// since it is already null at this point in time
			tail = node;
		} else {
			head.setPrevious(node);
			node.setNext(head);
		}
		head = node;
		size++;
	}

	public void addToEnd(T data) {
		Node<T> node = new Node<T>(data);
		if (tail == null) {
			head = node;
		} else {
			tail.setNext(node);
			node.setPrevious(tail);
		}
		tail = node;
		size++;
	}

	public Node<T> removeFromFront() {
		if (isEmpty()) {
			return null;
		}

		Node<T> removedNode = head;

		if (head.getNext() == null) {
			tail = null;
		} else {
			head.getNext().setPrevious(null);
		}

		head = head.getNext();
		size--;
		removedNode.setNext(null);
		return removedNode;
	}

	public Node<T> removeFromEnd() {
		if (isEmpty()) {
			return null;
		}

		Node<T> removedNode = tail;

		if (tail.getPrevious() == null) {
			head = null;
		} else {
			tail.getPrevious().setNext(null);
		}

		tail = tail.getPrevious();
		size--;
		removedNode.setPrevious(null);
		return removedNode;
	}

	public boolean isEmpty() {
		return (head == null);
	}

	public int getSize() {
		return size;
	}

	public void printList() {
		Node<T> current = head;
		System.out.print("HEAD -> ");
		while (current != null) {
			System.out.print(current);
			System.out.print(" <=> ");
			current = current.getNext();
		}
		System.out.println("null");
	}
}