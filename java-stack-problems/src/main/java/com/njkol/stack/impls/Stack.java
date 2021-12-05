package com.njkol.stack.impls;

public interface Stack<T> {

	public void push(T employee);
	public T pop();
	public T peek();
	
	public int size();
	public boolean isEmpty();
	public void printStack();
}
