package com.zoho2ndround;

public class SAmpleeeeee {

	public static void main(String[] args) {

		String input1 = "a5b11c4";
		String input2 = "j7f3c11";

		System.out.println(NumberToAlphabet(input1));
		System.out.println(NumberToAlphabet(input2));

	}

	public static String NumberToAlphabet(String input) {

		StringBuilder result = new StringBuilder();

		int i = 0;
		while (i < input.length()) {
			char ch = input.charAt(i++);
			StringBuilder workspace = new StringBuilder();
			while (i < input.length() && Character.isDigit(input.charAt(i))) {
				workspace.append(input.charAt(i++));

			}

			int count = input.length() > 0 ? Integer.parseInt(workspace.toString()) : 1;

			for (int j = 0; j < count; j++) {
				result.append(ch);
			}
		}

		return result.toString();

	}

}
