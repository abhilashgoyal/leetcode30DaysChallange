package ThirtyDayChallange.week2;

/**
 * These codes are part of Leetcode 30 day coding challenges
 * Link:  https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/
 * Question Link: https://leetcode.com/explore/other/card/30-day-leetcoding-challenge/528/week-1/3293/
 * Question alternate link: https://leetcode.com/problems/diameter-of-binary-tree/
 */+
public class Day4DiameterBinaryTree {
    /**
     * Definition for a binary tree node.
     */
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    // this is class variable which will hold diameter of a TreeNode
    private int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        getDiameterOfTree(root);
        return diameter;
    }

    private int getDiameterOfTree(TreeNode treeNode) {
        if (treeNode == null) return 0;
        int leftHeight = getDiameterOfTree(treeNode.left);
        int rightHeight = getDiameterOfTree(treeNode.right);
        diameter = Math.max(diameter, leftHeight + rightHeight);
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
