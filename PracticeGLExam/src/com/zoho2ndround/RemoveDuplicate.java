package com.zoho2ndround;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {

		int[] arr1 = { 2, 4, 6, 8 };
		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8 };

		Set<Integer> uniqueElements = new HashSet<>();

		for (int num : arr1) {
			uniqueElements.add(num);
		}

		for (int num : arr2) {
			uniqueElements.add(num);
		}

		int[] tempArray = new int[uniqueElements.size()];

		int index = 0;
		for (int num : uniqueElements) {
			tempArray[index++] = num;
		}
		
		System.out.println(Arrays.toString(tempArray));

	}

}
