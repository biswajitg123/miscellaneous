package com.demo.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class BubbleSort {

	public static void main(String[] args) {
		int[] nums = { 5, 3, 4, 1, 8, 9, 1 }; // 1,1,3,5,9
		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < nums.length - i; j++) {
				if (nums[j - 1] > nums[j]) {
					int tmp = nums[j];
					nums[j] = nums[j - 1];
					nums[j - 1] = tmp;
				}
			}
		}

		List<Integer> collect = Arrays.stream(nums).mapToObj(x -> x)
				.collect(Collectors.collectingAndThen(Collectors.partitioningBy(x -> x % 2 == 0), x -> {
					Collection<List<Integer>> values = x.values();
					ArrayList<Integer> al = new ArrayList<>();
					return al;

				}));
		System.out.println(collect);

		Map<Boolean, Optional<Integer>> collect2 = Arrays.stream(nums).mapToObj(x -> x)
				.collect(Collectors.partitioningBy(x -> x % 2 == 0, Collectors.reducing((x, y) -> x + y)));
		System.out.println(collect2);
		Arrays.stream(nums).mapToObj(x -> x).forEach(System.out::print);
	}

}
