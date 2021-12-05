package com.njkol.linkedlist.singly;

/**
 * 
 * @author Nilanjan Sarkar
 *
 * @param <T>
 */
public class SinglyLinkedList<T> {

	private Node<T> head;
	private int size;

	public boolean isEmpty() {
		return (head == null);
	}

	// used to insert a Node<T> at the start of linked list
	public void addToFront(T data) {
		Node<T> newNode = new Node<T>(data);
		newNode.setNext(head);
		head = newNode;
		size++;
	}

	// used to delete Node<T> from start of linked list
	public Node<T> deleteFirst() {
		Node<T> temp = head;
		head = head.getNext();
		return temp;
	}

	// Use to delete Node<T> after particular Node<T>
	public void deleteAfter(Node<T> after) {
		Node<T> temp = head;
		while (temp.getNext() != null && temp.data != after.data) {
			temp = temp.getNext();
		}
		if (temp.getNext() != null)
			temp.setNext(temp.getNext().getNext());
	}

	// used to insert a Node<T> at the start of linked list
	public void insertLast(T data) {
		Node<T> current = head;
		while (current.getNext() != null) {
			// we'll loop until current.next is null
			current = current.getNext(); 
		}
		Node<T> newNode = new Node<T>(data);
		newNode.data = data;
		current.setNext(newNode);
	}

	// For printing Linked List
	public void printLinkedList() {
		System.out.println("Printing LinkedList (head --> last) ");
		System.out.println("====================================");
		Node<T> current = head;
		while (current != null) {
			current = current.getNext();
			System.out.println(current);
		}
		System.out.println("====================================");
	}

	public int getSize() {
		return size;
	}
}
