package com.zoho2ndround;

import java.util.Arrays;
import java.util.Scanner;



public class MissingNumber {
	public static int findMissingNumber(int[] nums) {
		Arrays.sort(nums);
		int n = nums.length;
		int sum = (n + 1) * (n + 2) / 2;
		for (int num : nums) {
			sum -= num;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of elements:");
		int n = scanner.nextInt();

		int[] input = new int[n];

		System.out.println("Enter the elements separated by spaces:");
		for (int i = 0; i < n; i++) {
			input[i] = scanner.nextInt();
		}

		System.out.println("Missing number: " + findMissingNumber(input));

		scanner.close();
	}
}
