package com.njkol.linkedlist.singly;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.njkol.linkedlist.Employee;

class SinglyLinkedListTest {

	private SinglyLinkedList<Employee> list;
	
	@BeforeEach
	void setUp() throws Exception {
		 list = new SinglyLinkedList<Employee>();
	}

	@Test
	void testAddtoHead() {

		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		
		list.addToFront(janeJones);
		list.addToFront(johnDoe);
		list.addToFront(marySmith);
		list.addToFront(mikeWilson);
		
		assertEquals(4,list.getSize());
		
		list.printList();
	}

}
