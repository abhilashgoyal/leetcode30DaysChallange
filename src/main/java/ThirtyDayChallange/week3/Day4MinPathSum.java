package ThirtyDayChallange.week3;

/**
 * Question: https://leetcode.com/problems/minimum-path-sum/
 * Given a m x n grid filled with non-negative numbers,
 * find a path from top left to bottom right which minimizes the sum of all numbers along its path.
 * <p>
 * Note: You can only move either down or right at any point in time.
 * <p>
 * Example:
 * <p>
 * Input:
 * [
 * [1,3,1],
 * [1,5,1],
 * [4,2,1]
 * ]
 * Output: 7
 * Explanation: Because the path 1→3→1→1→1 minimizes the sum.
 */

/**
 * These codes are part of Leetcode 30 day coding challenges
 * Link:  https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/
 * Question Link: https://leetcode.com/explore/other/card/30-day-leetcoding-challenge/528/week-1/3303/
 */
public class Day4MinPathSum {
    public int minPathSum(int[][] grid) {
        int result = 0;
        if (grid == null || grid.length == 0) return result;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0 && j == 0) {
                    // first element, don't so anything
                } else if (i == 0) {
                    // first row, so we can only come from left
                    grid[i][j] = grid[i][j] + grid[i][j - 1];
                } else if (j == 0) {
                    // first column, so we can only come from top
                    grid[i][j] = grid[i][j] + grid[i - 1][j];
                } else {
                    // else we can either come from top or left, whichever is minimum
                    grid[i][j] = grid[i][j] + Math.min(grid[i][j - 1], grid[i - 1][j]);
                }
            }
        }

        return grid[grid.length - 1][grid[0].length - 1];
    }
}
