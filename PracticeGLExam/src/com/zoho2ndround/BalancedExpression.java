package com.zoho2ndround;

import java.util.regex.*;

public class BalancedExpression {
	public static void main(String[] args) {
		String input1 = "(a+b) * (ab)";
		String input2 = "(a+b)(ab+)";
		String input3 = "((a+b)";

		System.out.println(checkBalance(input1)); // Output: valid
		System.out.println(validateExpression(input2)); // Output: invalid
		System.out.println(checkBalance(input3));// Output: invalid
	}

	public static String checkBalance(String input) {
		int count = 0;

		for (char c : input.toCharArray()) {
			if (c == '(') {
				count++;
			} else if (c == ')') {
				count--;
				if (count < 0) {
					return "False";
				}
			}
		}

		return (count == 0) ? "True" : "False";
	}

	public static boolean validateExpression(String input) {
		// Define a regex pattern to match the valid expressions
		String pattern = "[a-z][\\+\\-\\*\\/][a-z]";

		// Compile the regex pattern
		Pattern p = Pattern.compile(pattern);

		// Match the pattern with the input expression
		Matcher m = p.matcher(input);

		// Check if the input expression matches the pattern
		return m.matches();
	}
}
