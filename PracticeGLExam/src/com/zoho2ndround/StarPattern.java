package com.zoho2ndround;

class StarPattern {

	public static void main(String[] args) {

		String input1 = "12345";
		String input2 = "guruPrasath";

		StarPattern1(input1);
		System.out.println();
		StarPattern1(input2);
	}

	public static void StarPattern1(String str) {

		int len = str.length();
		for (int i = 0; i < len; i++) { // for Rows
			int j = len - 1 - i; // for also rows
			for (int k = 0; k < len; k++) { // handles the condition
				if (k == i || k == j)
					System.out.print(str.charAt(k));
				else
					System.out.print(" ");

			}

			System.out.println();

		}

	}
}
