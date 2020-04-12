package ThirtyDayChallange.week2;

import org.junit.Assert;
import org.junit.Test;

public class Day5LastStoneWeightTest {
    Day5LastStoneWeight ob = new Day5LastStoneWeight();

    @Test
    public void lastStoneWeight() {
        int[] input1 = {2, 7, 4, 1, 8, 1};
        Assert.assertEquals(1, ob.lastStoneWeightPQSolution(input1));
    }
}