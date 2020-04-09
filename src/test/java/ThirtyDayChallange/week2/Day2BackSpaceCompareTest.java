package ThirtyDayChallange.week2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Day2BackSpaceCompareTest {
    Day2BackSpaceCompare ob = new Day2BackSpaceCompare();

    @Test
    public void backspaceCompare() {
        Assert.assertTrue(ob.backspaceCompare("ab#c", "ad#c"));
        Assert.assertTrue(ob.backspaceCompare("ab##", "c#d#"));
        Assert.assertFalse(ob.backspaceCompare("ab#c", "a"));
        Assert.assertTrue(ob.backspaceCompare("a##c", "#a#c"));
    }
}