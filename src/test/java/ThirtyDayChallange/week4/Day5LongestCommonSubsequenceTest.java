package ThirtyDayChallange.week4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Day5LongestCommonSubsequenceTest {
    Day5LongestCommonSubsequence ob = new Day5LongestCommonSubsequence();

    @Test
    public void longestCommonSubsequence() {
        Assert.assertEquals(2, ob.longestCommonSubsequence("abcdef", "xakjkf"));
        Assert.assertEquals(0, ob.longestCommonSubsequence("abcd", "xyz"));
    }
}