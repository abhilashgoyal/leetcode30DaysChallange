package ThirtyDayChallange.week3;

public class Day5SearhInRotatedSortedArray {

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
        int left = 0, right = input.length -1;
        while(left < right){
            int mid = (left + right)/2;
            if(input[mid] > input[right]){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return left;
    }
}
