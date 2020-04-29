package ThirtyDayChallange.week5;

/**
 * Question: https://leetcode.com/problems/binary-tree-maximum-path-sum/
 * <p>
 * Given a non-empty binary tree, find the maximum path sum.
 * <p>
 * For this problem, a path is defined as any sequence of nodes from some starting node to any node in the tree along the parent-child connections. The path must contain at least one node and does not need to go through the root.
 * <p>
 * Example 1:
 * <p>
 * Input: [1,2,3]
 * <p>
 * 1
 * / \
 * 2   3
 * <p>
 * Output: 6
 * <p>
 * Example 2:
 * <p>
 * Input: [-10,9,20,null,null,15,7]
 * <p>
 * -10
 * / \
 * 9  20
 * /  \
 * 15   7
 * <p>
 * Output: 42
 */

/**
 * These codes are part of Leetcode 30 day coding challenges
 * Link:  https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/
 * Question Link: https://leetcode.com/explore/other/card/30-day-leetcoding-challenge/528/week-1/3314/
 */
public class Day1BinaryTreeMaximumPathSum {
    int max = Integer.MIN_VALUE;

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int maxPathSum(TreeNode root) {
        maximumPathSum(root);
        return max;
    }

    private int maximumPathSum(TreeNode root) {
        if (root == null) return 0;

        // get the sum of left sub-tree
        int leftSum = maximumPathSum(root.left);
        // get the sum of right sub-tree
        int rightSum = maximumPathSum(root.right);
        // to find the result, update whatever is maximum
        max = Math.max(max, leftSum + rightSum + root.val);
        // returm the result for each sub-call, for each node, decision is should I pick left or right sub tree
        // which is to be returned to its parent. Hence decision is to take either on of them, or 0
        return Math.max(0, Math.max(leftSum, rightSum) + root.val);
    }
}
