package com.njkol.queue.impls;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.njkol.queue.Employee;

class ArrayQueueTest {

	private ArrayQueue queue;

	@BeforeEach
	void setUp() throws Exception {
		queue = new ArrayQueue(10);
	}

	@Test
	void testAdd() {

		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee billEnd = new Employee("Bill", "End", 78);

		queue.add(janeJones);
		queue.add(johnDoe);
		queue.add(marySmith);
		queue.add(mikeWilson);
		queue.add(billEnd);
		queue.printQueue();

		assertEquals(5, queue.size());
	}

	@Test
	void testPeek() {

		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);

		queue.add(janeJones);
		queue.add(johnDoe);
		queue.add(marySmith);

		Employee emp = queue.peek();

		assertEquals(123, emp.getId());
		assertEquals(3, queue.size());
	}

	@Test
	void testRemove() {

		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);

		queue.add(janeJones);
		queue.add(johnDoe);
		queue.add(marySmith);
		
		Employee emp = queue.remove();

		assertEquals(123, emp.getId());
		assertEquals(2, queue.size());
		
		queue.printQueue();
	}
}
