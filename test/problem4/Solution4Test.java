package problem4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution4Test {

    Solution4 solution4 = new Solution4();

    @Test
    void LeetCodeTestCase1() {
        assertEquals(2.0000, solution4.findMedianSortedArrays(new int[]{1,3}, new int[]{2}));
    }

    @Test
    void LeetCodeTestCase2() {
        assertEquals(2.5000, solution4.findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));
    }
}