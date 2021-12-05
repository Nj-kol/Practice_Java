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
        }
        else {
            head.setPrevious(node);
            node.setNext(head);
        }
        head = node;
        size++;
    }
    
	public boolean isEmpty() {
		return (head == null);
	}

	public int getSize() {
		return size;
	}

	// For printing Linked List
	public void printLinkedList() {
		System.out.println("Printing LinkedList (head <==> last) ");
		System.out.println("====================================");
		Node<T> current = head;
		while (current != null) {
			current = current.getNext();
			System.out.println(current);
		}
		System.out.println("====================================");
	}
}
