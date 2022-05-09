package com.njkol.strings.basic;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1
 * 
 * Given a String S, reverse the string without reversing its individual words.
 * Words are separated by dots.
 * 
 * @author Nilanjan
 *
 */
public class ReverseWords {

	// Function to reverse words in a given string.
	public String reverseWordsNaive(String S) {
		
		StringBuilder sb = new StringBuilder();
		LinkedList<String> ls = new LinkedList<>();
		
		String tokens[] = S.split("\\.");
		
		for (String token : tokens) {
			ls.push(token);
		}

		int s = ls.size();
		while (s != 0) {
			sb.append(ls.pop());
			sb.append(".");
			s--;
		}
		return sb.toString();
	}

	// Function to reverse words in a given string.
	public String reverseWordsOptimal(String str) {
	
		StringBuilder sb = new StringBuilder();
		LinkedList<Character> st = new LinkedList<>();
       
		 //	???
		
		return sb.toString();
	}
}
