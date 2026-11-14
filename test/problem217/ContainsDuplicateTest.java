package problem217;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    ContainsDuplicate containsDuplicate = new ContainsDuplicate();

    @Nested
    class LeetcodeTestCase1 {
        @Test
        void shouldReturnTrueWhenFirstAndLastElementsMatch() {
            assertTrue(containsDuplicate.containsDuplicate(new int[]{1, 2, 3, 1}));
        }
    }

    @Nested
    class LeetcodeTestCase2 {
        @Test
        void shouldReturnFalseWhenAllElementsAreDistinct() {
            assertFalse(containsDuplicate.containsDuplicate(new int[]{1, 2, 3, 4}));
        }
    }

    @Nested
    class LeetcodeTestCase3 {
        @Test
        void shouldReturnTrueWhenManyValuesAreRepeated() {
            assertTrue(containsDuplicate.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
        }
    }

    @Nested
    class EdgeCases {
        @Test
        void shouldReturnFalseForSingleElement() {
            assertFalse(containsDuplicate.containsDuplicate(new int[]{7}));
        }

        @Test
        void shouldReturnTrueForTwoEqualElements() {
            assertTrue(containsDuplicate.containsDuplicate(new int[]{5, 5}));
        }

        @Test
        void shouldReturnFalseForTwoDifferentElements() {
            assertFalse(containsDuplicate.containsDuplicate(new int[]{5, 6}));
        }

        @Test
        void shouldHandleDuplicateZeros() {
            assertTrue(containsDuplicate.containsDuplicate(new int[]{0, 1, 0}));
        }

        @Test
        void shouldHandleDuplicateNegatives() {
            assertTrue(containsDuplicate.containsDuplicate(new int[]{-3, 4, -3}));
        }

        @Test
        void shouldNotTreatNegativeAndPositiveAsEqual() {
            assertFalse(containsDuplicate.containsDuplicate(new int[]{-1, 1}));
        }

        @Test
        void shouldHandleConstraintBoundaryValues() {
            assertTrue(containsDuplicate.containsDuplicate(new int[]{-1_000_000_000, 1_000_000_000, -1_000_000_000}));
            assertFalse(containsDuplicate.containsDuplicate(new int[]{-1_000_000_000, 1_000_000_000}));
        }
    }

    @Nested
    class TrickyCases {
        @Test
        void shouldDetectNonAdjacentDuplicatesInUnsortedInput() {
            assertTrue(containsDuplicate.containsDuplicate(new int[]{9, 4, 7, 1, 8, 4}));
        }

        @Test
        void shouldDetectAdjacentDuplicatesInTheMiddle() {
            assertTrue(containsDuplicate.containsDuplicate(new int[]{1, 2, 3, 3, 4, 5}));
        }

        @Test
        void shouldNotModifyTheInputArray() {
            int[] nums = {3, 1, 2};
            containsDuplicate.containsDuplicate(nums);
            assertArrayEquals(new int[]{3, 1, 2}, nums);
        }
    }

    @Nested
    class LargeInputs {
        @Test
        void shouldReturnFalseForMaxLengthDistinctArray() {
            int[] nums = new int[100_000];
            for (int i = 0; i < nums.length; i++) nums[i] = i;
            assertFalse(containsDuplicate.containsDuplicate(nums));
        }

        @Test
        void shouldReturnTrueForMaxLengthArrayWithOneDuplicateAtTheEnd() {
            int[] nums = new int[100_000];
            for (int i = 0; i < nums.length - 1; i++) nums[i] = i;
            nums[nums.length - 1] = 0;
            assertTrue(containsDuplicate.containsDuplicate(nums));
        }
    }
}
