package ThirtyDayChallange.week2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Day6ContiguousArrayTest {
    Day6ContiguousArray ob = new Day6ContiguousArray();

    @Test
    public void findMaxLength() {
        int[] input1 = {0, 1, 0};
        Assert.assertEquals(2, ob.findMaxLength(input1));
        int[] input2 = {0, 0};
        Assert.assertEquals(0, ob.findMaxLength(input2));
    }
}