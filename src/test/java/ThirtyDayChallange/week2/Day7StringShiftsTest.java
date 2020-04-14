package ThirtyDayChallange.week2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Day7StringShiftsTest {
    Day7StringShifts ob = new Day7StringShifts();

    @Test
    public void stringShift() {
        int[][] input1 = {
                {0, 1},
                {1, 2}
        };
        String string1 = "abc";
        Assert.assertEquals("cab", ob.stringShift(string1, input1));

        int[][] input2 = {
                {1, 1},
                {1, 1},
                {0, 2},
                {1, 3},
        };
        String string2 = "abcdefg";
        Assert.assertEquals("efgabcd", ob.stringShift(string2, input2));

        /**
         * "mecsk"
         * [[1,4],[0,5],[0,4],[1,1],[1,5]]
         */

        int[][] input3 = {
                {1, 4},
                {0, 5},
                {0, 4},
                {1, 1},
                {1, 5},
        };
        String string3 = "mecsk";
        Assert.assertEquals("kmecs", ob.stringShift(string3, input3));

        /**
         * "wpdhhcj"
         * [[0,7],[1,7],[1,0],[1,3],[0,3],[0,6],[1,2]]
         */
        int[][] input4 = {
                {0, 7},
                {1, 7},
                {1, 0},
                {1, 3},
                {0, 3},
                {0, 6},
                {1, 2},
        };
        String string4 = "wpdhhcj";
        Assert.assertEquals("hcjwpdh", ob.stringShift(string4, input4));
    }
}