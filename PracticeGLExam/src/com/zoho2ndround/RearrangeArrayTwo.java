package com.zoho2ndround;

import java.util.Arrays;

public class RearrangeArrayTwo {

	public static void main(String[] args) {

		int[] arrays = { 7, 3, 8, 9, 6, 5, 2, 1, 4 };

		Arrays.sort(arrays);

		rearrrange(arrays);
	}

	public static void rearrrange(int[] arrays) {

		int[] temp = new int[arrays.length];

		int left = 0, right = arrays.length - 1;

		boolean flag = true;

		for (int i = 0; i < arrays.length; i++) {

			if (flag) {

				temp[i] = arrays[right--];
			} else {
				temp[i] = arrays[left++];
			}
			flag = !flag;
		}

		System.out.println(Arrays.toString(temp));

	}

}
