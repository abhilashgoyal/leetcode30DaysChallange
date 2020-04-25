package ThirtyDayChallange.week4;

import org.junit.Test;

import static org.junit.Assert.*;

public class Day4JumpGameTest {
    Day4JumpGame ob = new Day4JumpGame();

    @Test
    public void canJump() {
        int[] input1 = {2, 3, 1, 1, 4};
        assertTrue(ob.canJump(input1));
        int[] input2 = {3, 2, 1, 0, 4};
        assertFalse(ob.canJump(input2));
        int[] input3 = {4, 2, 1, 0, 4};
        assertTrue(ob.canJump(input3));
    }
}