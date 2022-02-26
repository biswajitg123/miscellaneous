package com.demo.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateValueArray {

	public static boolean hasDuplicates(Integer arr[], int size) {

		Map<Integer, Integer> duplicateCount = new HashMap<>();

		for (int i = 0; i < size; i++) {

			int key = arr[i];
			if(duplicateCount.containsKey(key)) {
				return true;
			}
			else {
				int count = duplicateCount.getOrDefault(key, 0);
				duplicateCount.put(key, ++count);
			}
		}
		return false;
	}

	public static void main(String[] args) {

		int size;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size : ");
		size = sc.nextInt();
		Integer array[] = new Integer[size];

		System.out.print("Enter array : ");
		int i;
		for (i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}

		System.out.println(hasDuplicates(array, size));

	}

}
