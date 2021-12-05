package com.njkol.linkedlist;

import com.njkol.linkedlist.doubly.DoublyLinkedList;
import com.njkol.linkedlist.singly.SinglyLinkedList;

public class LinkedListClient {

	public static void main(String[] args) {

		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

		//SinglyLinkedList<Employee> list = new SinglyLinkedList<Employee>();
		DoublyLinkedList<Employee> list = new DoublyLinkedList<Employee>();

		System.out.println("Is the Linked List currently empty? : " + list.isEmpty());

		System.out.println("Adding elements");
		list.addToFront(janeJones);
		list.addToFront(johnDoe);
		list.addToFront(marySmith);
		list.addToFront(mikeWilson);

		System.out.println("Current size of the linked list : "+list.getSize());

		list.printLinkedList();

		// list.removeFromFront();
		// System.out.println(list.getSize());
		// list.printList();

	}

}
