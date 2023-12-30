package problem1;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution1 solution = new Solution1();

    @Nested
    class ValidArrays {
        @Test
        void testTwoSum() {
            int[] arrayOfNumbers = {2, 7, 11, 15};
            int target = 9;
            int[] result = solution.twoSum(arrayOfNumbers, target);
            assertArrayEquals(new int[]{0, 1}, result, "Test Case 1 Failed");
        }

        @Test
        void testTwoSumWithArrayContainingIntegers_3_2_4_withTarget_6() {
            int[] arrayOfNumbers = {3, 2, 4};
            int target = 6;
            int[] result = solution.twoSum(arrayOfNumbers, target);
            assertArrayEquals(new int[]{1, 2}, result, "Test Case 2 Failed");
        }

        @Test
        void testTwoSumWithArrayContainingIntegers_3_3withTarget_6() {
            int[] arrayOfNumbers = {3, 3};
            int target = 6;
            int[] result = solution.twoSum(arrayOfNumbers, target);
            assertArrayEquals(new int[]{0, 1}, result, "Test Case 3 Failed");
        }
    }

    @Nested
    class NoValidArrays {
        @Test
        void testNoSolution() {
            TwoSum solution = new TwoSum();

            int[] arrayOfNumbers = {1, 2, 3, 4};
            int target = 10;

            assertThrows(IllegalArgumentException.class, () -> solution.twoSum(arrayOfNumbers, target), "IllegalArgumentException not thrown for no solution");
        }
    }
}