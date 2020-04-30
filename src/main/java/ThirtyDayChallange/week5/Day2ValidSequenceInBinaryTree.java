package ThirtyDayChallange.week5;

/**
 * Check If a String Is a Valid Sequence from Root to Leaves Path in a Binary Tree
 * <p>
 * Given a binary tree where each path going from the root to any leaf form a valid sequence, check if a given string is a valid sequence in such binary tree.
 * <p>
 * We get the given string from the concatenation of an array of integers arr and the concatenation of all values of the nodes along a path results in a sequence in the given binary tree.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: root = [0,1,0,0,1,0,null,null,1,0,0], arr = [0,1,0,1]
 * Output: true
 * Explanation:
 * The path 0 -> 1 -> 0 -> 1 is a valid sequence (green color in the figure).
 * Other valid sequences are:
 * 0 -> 1 -> 1 -> 0
 * 0 -> 0 -> 0
 * <p>
 * Example 2:
 * <p>
 * Input: root = [0,1,0,0,1,0,null,null,1,0,0], arr = [0,0,1]
 * Output: false
 * Explanation: The path 0 -> 0 -> 1 does not exist, therefore it is not even a sequence.
 * <p>
 * Example 3:
 * <p>
 * Input: root = [0,1,0,0,1,0,null,null,1,0,0], arr = [0,1,1]
 * Output: false
 * Explanation: The path 0 -> 1 -> 1 is a sequence, but it is not a valid sequence.
 * <p>
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= arr.length <= 5000
 * 0 <= arr[i] <= 9
 * Each node's value is between [0 - 9].
 */

/**
 * These codes are part of Leetcode 30 day coding challenges
 * Link:  https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/
 * Question Link: https://leetcode.com/explore/other/card/30-day-leetcoding-challenge/528/week-1/3315/
 */
public class Day2ValidSequenceInBinaryTree {

    public boolean isValidSequence(TreeNode root, int[] arr) {
        if (arr == null || arr.length == 0 || (root == null && arr.length == 0)) return true;
        return isValidSequence(root, arr, 0);
    }

    private boolean isValidSequence(TreeNode root, int[] arr, int index) {
        // base condition
        if (root == null || index >= arr.length || root.val != arr[index]) return false;

        // If this node is a leaf and matches with last entry of array.
        if ((root.left == null && root.right == null)
                && (index == arr.length - 1 && root.val == arr[index]))
            return true;

        // check for valid sequence in each direction
        return isValidSequence(root.left, arr, index + 1) || isValidSequence(root.right, arr, index + 1);
    }
}
