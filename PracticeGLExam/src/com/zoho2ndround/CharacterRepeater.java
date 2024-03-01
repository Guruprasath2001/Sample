package com.zoho2ndround;

public class CharacterRepeater {
    public static String repeatCharacters(String input) {
        StringBuilder output = new StringBuilder();
        int i = 0;
        while (i < input.length()) {
            char currentChar = input.charAt(i++);
            StringBuilder countBuilder = new StringBuilder();

            // Construct the count of the character
            while (i < input.length() && Character.isDigit(input.charAt(i))) {
                countBuilder.append(input.charAt(i++));
            }
            int count = countBuilder.length() > 0 ? Integer.parseInt(countBuilder.toString()) : 1;

            // Repeat the character count times
            for (int j = 0; j < count; j++) {
                output.append(currentChar);
            }
        }
        return output.toString();
    }

    public static void main(String[] args) {
        String input = "g7j8k3l1";
        String output = repeatCharacters(input);
        System.out.println("Output: " + output);
    }
}
