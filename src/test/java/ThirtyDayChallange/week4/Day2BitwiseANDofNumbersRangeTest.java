package ThirtyDayChallange.week4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Day2BitwiseANDofNumbersRangeTest {
    Day2BitwiseANDofNumbersRange ob = new Day2BitwiseANDofNumbersRange();

    @Test
    public void rangeBitwiseAnd() {
        Assert.assertEquals(4, ob.rangeBitwiseAnd(5, 7));
        Assert.assertEquals(0, ob.rangeBitwiseAnd(0, 1));
    }
}