package com.njkol.stack.impls;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.njkol.stack.Employee;

/**
 * Test case for a Stack backed by an Array
 * 
 * @author Nilanjan Sarkar
 *
 */
class EmployeeStackTest {

	Stack<Employee> stack;

	@BeforeEach
	void setUp() throws Exception {
		stack = new EmployeeStack(5);
		stack.push(new Employee("Jane", "Jones", 123));
		stack.push(new Employee("John", "Doe", 4567));
		stack.push(new Employee("Mary", "Smith", 22));
		stack.push(new Employee("Mike", "Wilson", 3245));
	}

	@Test
	void testPeek() {
		stack.push(new Employee("Bill", "End", 78));
		Employee emp = stack.peek();
		System.err.println("The top item is : "+ emp);
		assertEquals("Bill", emp.getFirstName());
		assertEquals(5, stack.size());
	}

	@Test
	void testPush() {
		stack.push(new Employee("Bill", "End", 78));
		stack.printStack();
		assertEquals(5, stack.size());
	}

	@Test
	void testPop() {
		stack.push(new Employee("Bill", "End", 78));
		Employee emp = stack.pop();
		System.err.println("Popped item : "+ stack.pop());
		assertEquals("Bill", emp.getFirstName());
	}
}