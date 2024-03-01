package com.zoho2ndround;

public class BalancedBrackets {

    static boolean areBracketsBalanced(String expr) {
        int countRound = 0, countSquare = 0, countCurly = 0;

        for (char c : expr.toCharArray()) {
            if (c == '(')
                countRound++;
            else if (c == ')') {
                countRound--;
                if (countRound < 0)
                    return false;
            } else if (c == '[')
                countSquare++;
            else if (c == ']') {
                countSquare--;
                if (countSquare < 0)
                    return false;
            } else if (c == '{')
                countCurly++;
            else if (c == '}') {
                countCurly--;
                if (countCurly < 0)
                    return false;
            }
        }

        return countRound == 0 && countSquare == 0 && countCurly == 0;
    }

    public static void main(String[] args) {
        String expr = "([{}])";

        if (areBracketsBalanced(expr))
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
}
