package ThirtyDayChallange.week3;

import org.junit.Assert;
import org.junit.Test;

public class Day5SearhInRotatedSortedArrayTest {
    Day5SearchInRotatedSortedArray ob = new Day5SearchInRotatedSortedArray();

    @Test
    public void search() {
        int[] input1 = {4, 5, 6, 7, 0, 1, 2, 3};
        Assert.assertEquals(7, ob.search(input1, 3));

        int[] input2 = {4, 5, 6, 7, 0, 1, 2};
        Assert.assertEquals(-1, ob.search(input2, 3));

        int[] input3 = {0, 1, 2, 3, 4, 5, 6, 7};
        Assert.assertEquals(3, ob.search(input3, 3));

        int[] input4 = {4, 5, 6, 7, 8, 9, 0};
        Assert.assertEquals(-1, ob.search(input4, 3));

        int[] input5 = {1, 3};
        Assert.assertEquals(-1, ob.search(input5, 0));
    }
}