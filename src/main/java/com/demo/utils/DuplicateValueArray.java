package com.demo.utils;

import java.util.Scanner;

public class DuplicateValueArray {

	public static boolean hasDuplicates(Integer arr[], int size) {

		String distinct = "";

		for (int i = 0; i < size; i++) {

			if (distinct.contains("," + String.valueOf(arr[i]) + ",")) {
				return true;
			} else {
				distinct = distinct + "," + arr[i] + ",";
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
