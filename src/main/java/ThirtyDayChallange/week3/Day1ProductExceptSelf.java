package ThirtyDayChallange.week3;

import java.util.Arrays;

/**
 * Question link: https://leetcode.com/problems/product-of-array-except-self/
 * Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
 * <p>
 * Example:
 * <p>
 * Input:  [1,2,3,4]
 * Output: [24,12,8,6]
 * <p>
 * Constraint: It's guaranteed that the product of the elements of any prefix or suffix of the array (including the whole array) fits in a 32 bit integer.
 * <p>
 * Note: Please solve it without division and in O(n).
 * <p>
 * Follow up:
 * Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)
 */

/**
 * These codes are part of Leetcode 30 day coding challenges
 * Link:  https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/
 * Question Link: https://leetcode.com/explore/other/card/30-day-leetcoding-challenge/528/week-1/3300/
 */
public class Day1ProductExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0) return nums;
        int len = nums.length;
        int[] result = new int[len];
        Arrays.fill(result, 1);
        int left = 1;
        for (int i = 0; i < len; i++) {
            result[i] = left;
            left *= nums[i];
        }
        int right = 1;
        for (int i = len - 1; i >= 0; i--) {
            result[i] *= right;
            right *= nums[i];
        }

        return result;
    }
}
