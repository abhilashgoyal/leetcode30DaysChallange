package ThirtyDayChallange.week4;

import java.util.LinkedHashMap;

/**
 * Question Link: https://leetcode.com/problems/lru-cache/
 * <p>
 * <p>
 * Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and put.
 * <p>
 * get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
 * put(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity, it should invalidate the least recently used item before inserting a new item.
 * <p>
 * The cache is initialized with a positive capacity.
 * <p>
 * Follow up:
 * Could you do both operations in O(1) time complexity?
 * <p>
 * Example:
 * <p>
 * LRUCache cache = new LRUCache( 2 capacity)
 * cache.put(1,1)
 * cache.put(2,2);
 * cache.get(1);       // returns 1
 * cache.put(3,3);    // evicts key 2
 * cache.get(2);       // returns -1 (not found)
 * cache.put(4,4);    // evicts key 1
 * cache.get(1);       // returns -1 (not found)
 * cache.get(3);       // returns 3
 * cache.get(4);       // returns 4
 */

/**
 * These codes are part of Leetcode 30 day coding challenges
 * Link:  https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/
 * Question Link: https://leetcode.com/explore/other/card/30-day-leetcoding-challenge/528/week-1/3309/
 */
public class Day3LRUCache {

    private LinkedHashMap<Integer, Integer> cache;
    private int N;

    public Day3LRUCache(int capacity) {
        this.N = capacity;
        this.cache = new LinkedHashMap<Integer, Integer>();
    }

    public int get(int key) {
        int result = -1;

        if (this.cache.containsKey(key)) {
            result = this.cache.get(key);
            this.cache.remove(key);
            this.cache.put(key, result);
        }

        return result;
    }

    public void put(int key, int value) {
        if (this.cache.containsKey(key)) {
            this.cache.remove(key);
        } else {
            if (this.cache.size() == N) {
                Integer firstKey = this.cache.keySet().iterator().next();
                this.cache.remove(firstKey);
            }
        }

        this.cache.put(key, value);
    }
}
