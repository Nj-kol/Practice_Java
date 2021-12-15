package com.njkol.techniques.javahacks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JavaOOBTechniques {

	// A user-defined class to store domains with id and url
	private class Domain {
		private int id;
		private String url;

		// Constructor
		public Domain(int id, String url) {
			this.id = id;
			this.url = url;
		}

		public Integer getId() {
			return Integer.valueOf(id);
		}
	}

	public void simplesort() {

		// Create a list of strings
		ArrayList<String> al = new ArrayList<String>();
		al.add("Geeks For Geeks");
		al.add("Friends");
		al.add("Dear");
		al.add("Is");
		al.add("Superb");

		/*
		 * Collections.sort method is sorting the elements of ArrayList in ascending
		 * order.
		 */
		Collections.sort(al, Collections.reverseOrder());

		System.out.println(al);
	}

	public void binarySearchSimple() {

		List<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(10);
		al.add(20);

		// 10 is present at index 3.
		int index = Collections.binarySearch(al, 10);
		System.out.println(index);

		// 13 is not present. 13 would have been inserted
		// at position 4. So the function returns (-4-1)
		// which is -5.
		index = Collections.binarySearch(al, 13);
		System.out.println(index);
	}

	public void binarySearchWithComparator() {

		// Create a list
		List<Domain> l = new ArrayList<Domain>();
		l.add(new Domain(10, "quiz.geeksforgeeks.org"));
		l.add(new Domain(20, "practice.geeksforgeeks.org"));
		l.add(new Domain(30, "code.geeksforgeeks.org"));
		l.add(new Domain(40, "www.geeksforgeeks.org"));

		Comparator<Domain> c = new Comparator<Domain>() {
			public int compare(Domain u1, Domain u2) {
				return u1.getId().compareTo(u2.getId());
			}
		};

		// Searching a domain with key value 10. To search
		// we create an object of domain with key 10.
		int index = Collections.binarySearch(l, new Domain(10, null), c);
		System.out.println("Found at index  " + index);

		// Searching an item with key 5
		index = Collections.binarySearch(l, new Domain(5, null), c);
		System.out.println(index);
	
	}

}
