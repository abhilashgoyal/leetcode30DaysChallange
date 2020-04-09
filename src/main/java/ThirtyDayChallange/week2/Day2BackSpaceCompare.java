package ThirtyDayChallange.week2;

import java.util.Stack;

/**
 * These codes are part of Leetcode 30 day coding challenges
 * Link:  https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/
 * Question Link: https://leetcode.com/explore/other/card/30-day-leetcoding-challenge/528/week-1/3291/
 * Question alternate link: https://leetcode.com/problems/middle-of-the-linked-list/
 */
public class Day2BackSpaceCompare {
    private final char BACKSPACE_CHAR = '#';

    /**
     * Input: S = "ab#c", T = "ad#c"
     * Output: true
     * Explanation: Both S and T become "ac"
     *
     * @param S
     * @param T
     * @return
     */
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stack1 = getFormattedStack(S);
        Stack<Character> stack2 = getFormattedStack(T);

        if (stack1.size() != stack2.size()) return false;

        while (!stack1.isEmpty()) {
            if (stack1.pop() != stack2.pop()) return false;
        }

        return true;
    }

    private Stack<Character> getFormattedStack(String T) {
        Stack<Character> stack = new Stack<>();
        for (char c : T.toCharArray()) {
            if (!stack.isEmpty() && c == BACKSPACE_CHAR) {
                stack.pop();
            } else if (c != BACKSPACE_CHAR) {
                stack.push(c);
            }
        }
        return stack;
    }
}
