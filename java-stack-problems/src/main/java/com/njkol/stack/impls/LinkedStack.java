package com.njkol.stack.impls;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * A Stack implementation backed by a Linked List
 * 
 * @author Nilanjan Sarkar
 *
 * @param <T>
 */
public class LinkedStack<T> implements Stack<T> {
	
	private LinkedList<T> stack;

	public LinkedStack() {
		stack = new LinkedList<T>();
	}

	public void push(T employee) {
		stack.push(employee);
	}

	public T pop() {
		return stack.pop();
	}

	public T peek() {
		return stack.peek();
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	public void printStack() {
		ListIterator<T> iterator = stack.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public int size() {
		return stack.size();
	}
}