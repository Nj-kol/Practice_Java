package com.njkol.linkedlist.doubly;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.njkol.linkedlist.Employee;

class DoublyLinkedListTest {

	private DoublyLinkedList<Employee> list;
	
	@BeforeEach
	void setUp() throws Exception {
		 list = new DoublyLinkedList<Employee>();
	}

	
	@Test
	void testaddToFront() {
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


	@Test
	void testRemoveFromFront() {

		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		
		list.addToFront(janeJones);
		list.addToFront(johnDoe);
		list.addToFront(marySmith);
		list.addToFront(mikeWilson);
		
		assertEquals(4,list.getSize());
		
		list.removeFromFront();
		assertEquals(3,list.getSize());
		list.printList();
	}
	

	@Test
	void testAddToEnd() {

		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);

		list.addToFront(janeJones);
		list.addToFront(johnDoe);
		list.addToFront(marySmith);
		
		assertEquals(3,list.getSize());
		
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		
		list.addToEnd(mikeWilson);
		
		assertEquals(4,list.getSize());
		
		list.printList();
	}
	
	
	@Test
	void testRemoveFromEnd() {

		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		
		list.addToFront(janeJones);
		list.addToFront(johnDoe);
		list.addToFront(marySmith);
		list.addToFront(mikeWilson);
		
		assertEquals(4,list.getSize());
		
		list.removeFromEnd();
		assertEquals(3,list.getSize());
		list.printList();
	}
}
