package ThirtyDayChallange.week2;

import java.util.HashMap;
import java.util.Map;

/**
 * These codes are part of Leetcode 30 day coding challenges
 * Link:  https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/
 * Question Link: https://leetcode.com/explore/other/card/30-day-leetcoding-challenge/528/week-1/3298/
 * Question alternate link: https://leetcode.com/problems/contiguous-array/
 */
public class Day6ContiguousArray {
    public int findMaxLength(int[] nums) {
        int sum = 0;
        int res = 0;
        // Sum to Index mapping. Key is Sum and Value is its index
        Map<Integer, Integer> sumIndexMap = new HashMap<>();
        // base condition
        sumIndexMap.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            // increment sum for 1 and decrement for 0
            sum = nums[i] == 0 ? sum - 1 : sum + 1;
            if (sumIndexMap.containsKey(sum)) {
                res = Math.max(res, i - sumIndexMap.get(sum));
            } else {
                sumIndexMap.put(sum, i);
            }
        }
        return res;
    }
}
