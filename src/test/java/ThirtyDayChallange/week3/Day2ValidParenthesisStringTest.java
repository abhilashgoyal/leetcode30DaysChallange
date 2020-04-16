package ThirtyDayChallange.week3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Day2ValidParenthesisStringTest {
    Day2ValidParenthesisString ob = new Day2ValidParenthesisString();

    /**
     * Input: "(())((())()()(*)(*()(())())())()()((()())((()))(*"
     * Output: true
     * Expected: false
     */
    @Test
    public void checkValidString() {
        Assert.assertTrue(ob.checkValidString("(*)"));
        Assert.assertTrue(ob.checkValidString("()"));
        Assert.assertTrue(ob.checkValidString("(*))"));
        Assert.assertTrue(ob.checkValidString("(((******))"));
    }
}