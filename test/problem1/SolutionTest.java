package problem1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void testTwoSum() {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        assertArrayEquals(new int[]{0, 1}, result1, "Test Case 1 Failed");
    }

    @Test
    void testTwoSumWithArrayContainingIntegers_3_2_4_withTarget_6() {
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        assertArrayEquals(new int[]{1, 2}, result2, "Test Case 2 Failed");
    }

    @Test
    void testTwoSumWithArrayContainingIntegers_3_3withTarget_6() {
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = solution.twoSum(nums3, target3);
        assertArrayEquals(new int[]{0, 1}, result3, "Test Case 3 Failed");
    }

    @Test
    void testNoSolution() {
        TwoSum solution = new TwoSum();

        int[] nums = {1, 2, 3, 4};
        int target = 10;

        assertThrows(IllegalArgumentException.class, () -> {
            solution.twoSum(nums, target);
        }, "IllegalArgumentException not thrown for no solution");
    }
}
