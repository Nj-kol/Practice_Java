package com.njkol.hashtable.algos;

/**
 * A simple hash table implementation that does not handle collision
 * 
 * @author Nilanjan Sarkar
 *
 */
public class SimpleHashtable {

	private Employee[] hashtable;

	public SimpleHashtable() {
		hashtable = new Employee[10];
	}

	/**
	 * Does not handle collisions
	 * 
	 * @param key
	 * @param employee
	 */
	public void put(String key, Employee employee) {
		int hashedKey = hashKey(key);
		if (hashtable[hashedKey] != null) {
			System.out.println("Sorry, there's already an employee at position " + hashedKey);
		} else {
			hashtable[hashedKey] = employee;
		}
	}

	public Employee get(String key) {
		int hashedKey = hashKey(key);
		return hashtable[hashedKey];
	}

	private int hashKey(String key) {
		return key.length() % hashtable.length;
	}

	public void printHashtable() {
		for (int i = 0; i < hashtable.length; i++) {
			System.out.println(hashtable[i]);
		}
	}
}