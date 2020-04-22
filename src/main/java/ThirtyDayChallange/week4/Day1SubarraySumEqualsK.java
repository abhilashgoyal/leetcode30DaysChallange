package ThirtyDayChallange.week4;

import java.util.HashMap;
import java.util.Map;

/**
 * Question: https://leetcode.com/problems/subarray-sum-equals-k/
 * Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.
 * <p>
 * Example 1:
 * Input:nums = [1,1,1], k = 2
 * Output: 2
 * Note:
 * The length of the array is in range [1, 20,000].
 * The range of numbers in the array is [-1000, 1000] and the range of the integer k is [-1e7, 1e7].
 */

/**
 * These codes are part of Leetcode 30 day coding challenges
 * Link:  https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/
 * Question Link: https://leetcode.com/explore/other/card/30-day-leetcoding-challenge/528/week-1/3307/
 */
public class Day1SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        if (nums.length == 0) {
            return count;
        }
        int sum = 0;
        Map<Integer, Integer> sumMap = new HashMap<>();
        sumMap.put(sum, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sumMap.containsKey(sum - k)) {
                count += sumMap.get(sum - k);
            }

            sumMap.put(sum, sumMap.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
