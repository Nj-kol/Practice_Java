package com.njkol.recursion.number.problems;
/**
 * What is GCD?
 * 
 * The GCD of two integers is the largest integer that can fully divide both numbers, without a remainder.
 * 
 * @author Nilanjan
 *
 */
public class GCD {
	
	public int findGCD(int num1, int num2) {
		
		 // Base case
        if (num1 == num2) {
            return num1;
        }
        
        // Recursive case
        if (num1 > num2) {
            return findGCD(num1-num2, num2);
        }
        else {
            return findGCD(num1, num2-num1);
        }
	}
}
