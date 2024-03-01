package com.practice;

import java.util.Scanner;

public class AllZerosLast {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Array value: ");

		int num = sc.nextInt();

		int[] arrays = new int[num];

		System.out.println("Enter the Arrays: ");

		for (int i = 0; i < num; i++) {

			arrays[i] = sc.nextInt();

		}

		nonZeroIndex(arrays);

		for (int ans : arrays) {

			System.out.println(ans + " ");
		}

	}

	private static void nonZeroIndex(int[] arrays) {

		int n = arrays.length;

		int nonZeroIndex = 0;

		for (int i = 0; i < n; i++) {

			if (arrays[i] != 0) {

				int temp = arrays[i];

				arrays[i] = arrays[nonZeroIndex];

				arrays[nonZeroIndex] = temp;

				nonZeroIndex++;

			}

		}

	}

}
