package ThirtyDayChallange.week3;

/**
 * Question: https://leetcode.com/problems/number-of-islands/
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands.
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or
 * vertically. You may assume all four edges of the grid are all surrounded by water.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * 11110
 * 11010
 * 11000
 * 00000
 * <p>
 * Output: 1
 * <p>
 * Example 2:
 * <p>
 * Input:
 * 11000
 * 11000
 * 00100
 * 00011
 * <p>
 * Output: 3
 */

/**
 * These codes are part of Leetcode 30 day coding challenges
 * Link:  https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/
 * Question Link: https://leetcode.com/explore/other/card/30-day-leetcoding-challenge/528/week-1/3302/
 */
public class Day3NumberOfIsland {
    public int numIslands(char[][] grid) {
        int count = 0;
        if (grid == null || grid.length == 0) return count;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    // do a DFS for a entire island and convert every '1' of this island to '0'
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }

    private void dfs(char[][] input, int i, int j) {
        // base condition
        if (i < 0 || j < 0 || i >= input.length || j >= input[i].length || input[i][j] == '0') return;

        input[i][j] = '0';
        // explore left
        dfs(input, i - 1, j);
        // explore up
        dfs(input, i, j - 1);
        // explore right
        dfs(input, i, j + 1);
        // explore down
        dfs(input, i + 1, j);
    }
}
