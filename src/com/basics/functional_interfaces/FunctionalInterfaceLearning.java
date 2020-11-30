/**
 * 
 */
package com.basics.functional_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Sharad
 *
 *
 *Functional Interfaces have a single functionality to exhibit. For e.g. Comparable interface has a 
 *single method compareTo for comparison functionality. Such methods are used extensively in lambda 
 *functions
 *
 */
public class FunctionalInterfaceLearning {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		System.out.println("Print all numbers");
		eval(list, n->true);
		
		System.out.println("Print even numbers");
		eval(list,n->n%2==0);
		
		System.out.println("Print numbers greater than 3");
		eval(list, n-> n>3);
	}
	
	public static void eval(List<Integer> list, Predicate<Integer> predicate) {
		
		for(Integer n: list) {
			if(predicate.test(n)) System.out.print(n+" ");
		}
		
	}

}
