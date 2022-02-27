package com.demo.utils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindSecondMax {

	public static void main(String[] args) {
		int[] nums = { 1, 4, 6, 8, 2, 9, 9 };
		
		
		//Find if any duplicate
		 Set<Integer> a = new HashSet<Integer>();
	        Arrays.stream(nums)
	               .anyMatch(x->!a.add(x));
	        
	     //2nd solution
	        Set<Integer> b = new HashSet<Integer>();
	}

}
