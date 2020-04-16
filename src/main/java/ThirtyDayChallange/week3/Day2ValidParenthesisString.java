package ThirtyDayChallange.week3;

import java.util.Stack;

/**
 * Question: https://leetcode.com/problems/valid-parenthesis-string/
 * <p>
 * Given a string containing only three types of characters: '(', ')' and '*', write a function to check whether this string is valid. We define the validity of a string by these rules:
 * <p>
 * Any left parenthesis '(' must have a corresponding right parenthesis ')'.
 * Any right parenthesis ')' must have a corresponding left parenthesis '('.
 * Left parenthesis '(' must go before the corresponding right parenthesis ')'.
 * '*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string.
 * An empty string is also valid.
 * <p>
 * Example 1:
 * <p>
 * Input: "()"
 * Output: True
 * <p>
 * Example 2:
 * <p>
 * Input: "(*)"
 * Output: True
 * <p>
 * Example 3:
 * <p>
 * Input: "(*))"
 * Output: True
 */

/**
 * These codes are part of Leetcode 30 day coding challenges
 * Link:  https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/
 * Question Link: https://leetcode.com/explore/other/card/30-day-leetcoding-challenge/528/week-1/3301/
 */
public class Day2ValidParenthesisString {
    public boolean checkValidString(String s) {
        Stack<Integer> leftIndex = new Stack<>();
        Stack<Integer> starIndex = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(')
                leftIndex.push(i);
            else if (ch == '*')
                starIndex.push(i);
            else {
                if (leftIndex.isEmpty() && starIndex.isEmpty()) return false;
                if (!leftIndex.isEmpty())
                    leftIndex.pop();
                else
                    starIndex.pop();
            }
        }
        while (!leftIndex.isEmpty() && !starIndex.isEmpty()) {
            if (leftIndex.pop() > starIndex.pop())
                return false;
        }
        return leftIndex.isEmpty();
    }
}
