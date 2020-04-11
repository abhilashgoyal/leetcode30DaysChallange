package ThirtyDayChallange.week2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Day3MinStackTest {
    Day3MinStack ob = new Day3MinStack();

    @Test
    public void getMin() {
        ob.push(-1);
        ob.push(-2);
        ob.push(-3);
        ob.push(-4);
        Assert.assertEquals(-4, ob.getMin());
        ob.pop();
        Assert.assertEquals(-3, ob.getMin());
        ob.pop();
        Assert.assertEquals(-2, ob.getMin());
        ob.pop();
        Assert.assertEquals(-1, ob.getMin());
        ob.pop();
    }
}