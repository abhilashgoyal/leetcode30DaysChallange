package ThirtyDayChallange.week2;

/**
 * These codes are part of Leetcode 30 day coding challenges
 * Link:  https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/
 * Question Link: https://leetcode.com/explore/other/card/30-day-leetcoding-challenge/528/week-1/3299/
 */
public class Day7StringShifts {
    public String stringShift(String s, int[][] shift) {
        if (s == null || s.length() == 0) return s;
        int len = s.length();
        int leftShift = 0;
        int rightShift = 0;
        // negative shows left shift and positive shows right shift
        for (int[] eachShift : shift) {
            if (eachShift[0] == 0) {
                leftShift = (leftShift + eachShift[1]);
            } else {
                rightShift = (rightShift + eachShift[1]);
            }
        }

        if (leftShift == rightShift) {
            return s;
        } else {
            return rotateString(s, Math.abs(rightShift - leftShift) % len, rightShift > leftShift);
        }
    }

    private String rotateString(String input, int count, boolean right) {
        count = right ? input.length() - count : count;
        return input.substring(count) + input.substring(0, count);
    }
}
