package ThirtyDayChallange.week3;

import org.junit.Test;

import static org.junit.Assert.*;

public class Day1ProductExceptSelfTest {
    Day1ProductExceptSelf ob = new Day1ProductExceptSelf();

    @Test
    public void productExceptSelf() {
        int[] input1 = {1, 2, 3, 4};
        int[] result = {24, 12, 8, 6};
        assertArrayEquals(result, ob.productExceptSelf(input1));
    }
}