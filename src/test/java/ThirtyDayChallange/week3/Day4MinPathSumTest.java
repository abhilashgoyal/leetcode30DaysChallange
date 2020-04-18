package ThirtyDayChallange.week3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Day4MinPathSumTest {
    Day4MinPathSum ob = new Day4MinPathSum();

    @Test
    public void minPathSum() {
        int[][] input1 = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1},
        };
        Assert.assertEquals(7, ob.minPathSum(input1));
    }
}