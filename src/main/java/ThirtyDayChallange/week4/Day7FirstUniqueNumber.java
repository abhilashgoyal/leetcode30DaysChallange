package ThirtyDayChallange.week4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * You have a queue of integers, you need to retrieve the first unique integer in the queue.
 * <p>
 * Implement the FirstUnique class:
 * <p>
 * FirstUnique(int[] nums) Initializes the object with the numbers in the queue.
 * int showFirstUnique() returns the value of the first unique integer of the queue, and returns -1 if there is no such integer.
 * void add(int value) insert value to the queue.
 */

/**
 * These codes are part of Leetcode 30 day coding challenges
 * Link:  https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/
 * Question Link: https://leetcode.com/explore/other/card/30-day-leetcoding-challenge/528/week-1/3313/
 */
public class Day7FirstUniqueNumber {

    List<Integer> lst;
    LinkedHashSet<Integer> uniq;
    HashSet<Integer> dup;

    public Day7FirstUniqueNumber(int[] nums) {
        lst = new ArrayList<Integer>();
        dup = new HashSet<Integer>();
        uniq = new LinkedHashSet<Integer>();

        for (int num : nums) {
            if (!uniq.contains(num) && !dup.contains(num)) {
                uniq.add(num);
            } else {
                if (uniq.contains(num)) {
                    uniq.remove(num);
                    dup.add(num);
                }
            }
        }
    }

    public int showFirstUnique() {
        if (uniq.size() == 0)
            return -1;
        for (int num : uniq) {
            return num;
        }
        return -1;
    }

    public void add(int num) {
        if (!uniq.contains(num) && !dup.contains(num)) {
            uniq.add(num);
        } else {
            if (uniq.contains(num)) {
                uniq.remove(num);
                dup.add(num);
            }
        }
    }

}
