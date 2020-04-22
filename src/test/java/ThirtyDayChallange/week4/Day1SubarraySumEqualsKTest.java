package ThirtyDayChallange.week4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Day1SubarraySumEqualsKTest {
    Day1SubarraySumEqualsK ob = new Day1SubarraySumEqualsK();

    @Test
    public void subarraySum() {
        int[] input1 = {1, 1, 1};
        Assert.assertEquals(2, ob.subarraySum(input1, 2));
    }
}