package problem2;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    Solution2 solution2 = new Solution2();

    @Nested
    class LeetCodeTestCase1 {
        @Test
        void shouldReturnSumOfLinkedListsInReverseOrder() {
            ListNode l1 = createLinkedListWithNumbers(new int[]{2, 4, 3});
            ListNode l2 = createLinkedListWithNumbers(new int[]{5, 6, 4});
            ListNode expected = createLinkedListWithNumbers(new int[]{7, 0, 8});
            ListNode result = solution2.addTwoNumbers(l1, l2);
            assertLinkedListEquals(expected, result);
        }
    }

    @Nested
    class LeetCodeTestCase2 {
        @Test
        void shouldReturnSumOfLinkedListsInReverseOrder() {
            ListNode l1 = createLinkedListWithNumbers(new int[]{0});
            ListNode l2 = createLinkedListWithNumbers(new int[]{0});
            ListNode expected = createLinkedListWithNumbers(new int[]{0});
            ListNode result = solution2.addTwoNumbers(l1,l2);
            assertLinkedListEquals(expected, result);
        }
    }

    @Nested
    class LeetCodeTestCase3 {
        @Test
        void shouldReturnSumOfLinkedListsInReverseOrder() {
            ListNode l1 = createLinkedListWithNumbers(new int[]{9,9,9,9,9,9,9});
            ListNode l2 = createLinkedListWithNumbers(new int[]{9,9,9,9});
            ListNode expected = createLinkedListWithNumbers(new int[]{8,9,9,9,0,0,0,1});
            ListNode result = solution2.addTwoNumbers(l1,l2);
            assertLinkedListEquals(expected, result);
        }
    }

    @Nested
    class LeetCodeTestCase4 {
        @Test
        void shouldReturnSumOfLinkedListsInReverseOrder() {
            ListNode l1 = createLinkedListWithNumbers(new int[]{9});
            ListNode l2 = createLinkedListWithNumbers(new int[]{1,9,9,9,9,9,9,9,9,9});
            ListNode expected = createLinkedListWithNumbers(new int[]{0,0,0,0,0,0,0,0,0,0,1});
            ListNode result = solution2.addTwoNumbers(l1,l2);
            assertLinkedListEquals(expected, result);
        }
    }

    private ListNode createLinkedListWithNumbers(int[] values) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }
        return dummyHead.next;
    }

    private void assertLinkedListEquals(ListNode expected, ListNode actual) {
        while (expected != null || actual != null) {
            assertNotNull(expected);
            assertNotNull(actual);
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
        assertNull(expected);
        assertNull(actual);
    }
}