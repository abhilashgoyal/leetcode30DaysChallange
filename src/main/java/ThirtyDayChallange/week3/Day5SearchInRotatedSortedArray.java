package ThirtyDayChallange.week3;


/**
 * Question: https://leetcode.com/problems/search-in-rotated-sorted-array/
 * <p>
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 * <p>
 * (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
 * <p>
 * You are given a target value to search. If found in the array return its index, otherwise return -1.
 * <p>
 * You may assume no duplicate exists in the array.
 * <p>
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 * Example 2:
 * <p>
 * Input: nums = [4,5,6,7,0,1,2], target = 3
 * Output: -1
 */

/**
 * These codes are part of Leetcode 30 day coding challenges
 * Link:  https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/
 * Question Link: https://leetcode.com/explore/other/card/30-day-leetcoding-challenge/528/week-1/3304/
 */
public class Day5SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        int pivot = getSortedIndex(nums);
        if (target >= nums[pivot] && target <= nums[nums.length - 1]) {
            // search in right side
            return binarySearch(nums, pivot, nums.length - 1, target);
        } else {
            // search in left side
            return binarySearch(nums, 0, pivot - 1, target);
        }
    }

    /**
     * This function do a normal binary search in a sorted array from 'start' index to 'end' index
     *
     * @param input
     * @param start
     * @param end
     * @param target
     * @return
     */
    private int binarySearch(int[] input, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (input[mid] == target) return mid;
            else if (target > input[mid]) start = mid + 1;
            else if (target < input[mid]) end = mid - 1;
        }
        return -1;
    }

    /**
     * This function return the index of smallest element in the rotated sorted array,
     * i.e. the Point at which the array is rotated
     *
     * @param input
     * @return
     */
    private int getSortedIndex(int[] input) {
        int left = 0, right = input.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (input[mid] > input[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
