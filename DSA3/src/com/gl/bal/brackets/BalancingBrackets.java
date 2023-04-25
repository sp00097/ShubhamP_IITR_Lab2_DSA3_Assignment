package com.gl.bal.brackets;

import java.util.*;

public class BalancingBrackets {
	/*
	 * public static void main(String[] args) { Scanner sc = new Scanner(System.in);
	 * System.out.print("Enter the string of brackets: "); String input =
	 * sc.nextLine();
	 * 
	 * if (isBalanced(input)) {
	 * System.out.println("The entered String has Balanced Brackets"); } else {
	 * System.out.println("The entered Strings do not contain Balanced Brackets.");
	 * } }
	 */

    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.empty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == ']' && top != '[') ||
                    (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}