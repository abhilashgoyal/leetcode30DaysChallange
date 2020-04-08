package ThirtyDayChallange.week2;

import org.junit.Assert;
import org.junit.Test;

public class Day1LLMiddleElememtTest {
    Day1LLMiddleElememt ob = new Day1LLMiddleElememt();

    @Test
    public void middleNode() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        Assert.assertEquals(3, ob.middleNode(head).val);
        Assert.assertEquals(4, ob.middleNode(head.next).val);
    }
}