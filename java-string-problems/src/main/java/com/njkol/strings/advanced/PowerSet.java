package com.njkol.strings.advanced;

public class PowerSet {

	void powerSet(String str,int i, String curr) {
		
		if(i == str.length()) {
			System.out.println(curr);
			return;
		}
		
		powerSet(str,i+1,curr + str.charAt(i));
		powerSet(str,i+1,curr);
	}
}
