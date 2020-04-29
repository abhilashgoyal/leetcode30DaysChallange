package ThirtyDayChallange.week4;

/**
 * Given a 2D binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.
 * <p>
 * Example:
 * <p>
 * Input:
 * <p>
 * 1 0 1 0 0
 * 1 0 1 1 1
 * 1 1 1 1 1
 * 1 0 0 1 0
 * <p>
 * Output: 4
 */

/**
 * These codes are part of Leetcode 30 day coding challenges
 * Link:  https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/
 * Question Link: https://leetcode.com/explore/other/card/30-day-leetcoding-challenge/528/week-1/3312/
 */
public class Day6MaximalSquare {

    public int maximalSquare(char[][] matrix) {
        int max = 0;
        if (matrix == null || matrix.length == 0) return max;

        int len = matrix.length;
        int bre = matrix[0].length;
        int[][] dp = new int[len][bre];

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < bre; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = matrix[i][j] - '0';
                } else if (matrix[i][j] == '0') {
                    dp[i][j] = 0;
                } else if (matrix[i - 1][j] == '0' || matrix[i][j - 1] == '0' || matrix[i - 1][j - 1] == '0') {
                    dp[i][j] = matrix[i][j] - '0';
                } else if (matrix[i - 1][j] > '0' && matrix[i][j - 1] > '0' && matrix[i - 1][j - 1] > '0') {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1], dp[i - 1][j]), dp[i][j - 1]) + 1;
                }
                max = Math.max(max, dp[i][j]);
            }
        }
        return max * max;
    }
}
