package ThirtyDayChallange.week2;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * These codes are part of Leetcode 30 day coding challenges
 * Link:  https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/
 * Question Link: https://leetcode.com/explore/other/card/30-day-leetcoding-challenge/528/week-1/3297/
 * Question alternate link: https://leetcode.com/problems/last-stone-weight/
 */
public class Day5LastStoneWeight {
    /**
     * Priority Queue Accepted Solution
     *
     * @param stones
     * @return
     */
    public int lastStoneWeightPQSolution(int[] stones) {
        PriorityQueue<Integer> maxQ = new PriorityQueue<>(Comparator.reverseOrder());
        for (int st : stones) {
            maxQ.offer(st);
        }
        while (maxQ.size() > 1) {
            maxQ.offer(maxQ.poll() - maxQ.poll());
        }
        return maxQ.peek();
    }
}
