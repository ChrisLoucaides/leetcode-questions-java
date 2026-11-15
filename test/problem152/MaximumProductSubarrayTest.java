package problem152;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MaximumProductSubarrayTest {

    MaximumProductSubarray maximumProductSubarray = new MaximumProductSubarray();

    @Nested
    class LeetcodeTestCase1 {
        @Test
        void shouldStopBeforeASingleNegative() {
            // [2, 3] = 6
            assertEquals(6, maximumProductSubarray.maxProduct(new int[]{2, 3, -2, 4}));
        }
    }

    @Nested
    class LeetcodeTestCase2 {
        @Test
        void shouldNotPairNegativesAcrossAZero() {
            // [-2, -1] isn't contiguous, so the answer is 0, not 2
            assertEquals(0, maximumProductSubarray.maxProduct(new int[]{-2, 0, -1}));
        }
    }

    @Nested
    class EdgeCases {
        @Test
        void shouldReturnTheOnlyElementForSinglePositive() {
            assertEquals(10, maximumProductSubarray.maxProduct(new int[]{10}));
        }

        @Test
        void shouldReturnTheOnlyElementForSingleNegative() {
            // subarray must be non-empty, so the answer can be negative
            assertEquals(-10, maximumProductSubarray.maxProduct(new int[]{-10}));
        }

        @Test
        void shouldReturnZeroForSingleZero() {
            assertEquals(0, maximumProductSubarray.maxProduct(new int[]{0}));
        }

        @Test
        void shouldMultiplyEverythingWhenAllArePositive() {
            assertEquals(120, maximumProductSubarray.maxProduct(new int[]{1, 2, 3, 4, 5}));
        }

        @Test
        void shouldReturnZeroWhenAllAreZero() {
            assertEquals(0, maximumProductSubarray.maxProduct(new int[]{0, 0}));
        }

        @Test
        void shouldPreferZeroOverSeparatedNegatives() {
            assertEquals(0, maximumProductSubarray.maxProduct(new int[]{-3, 0, -2}));
        }
    }

    @Nested
    class NegativeCases {
        @Test
        void shouldMultiplyTwoNegativesIntoAPositive() {
            assertEquals(6, maximumProductSubarray.maxProduct(new int[]{-2, -3}));
        }

        @Test
        void shouldTurnTheSmallestProductIntoTheLargest() {
            // -2 * 3 = -6 is the minimum, and * -4 makes it 24
            assertEquals(24, maximumProductSubarray.maxProduct(new int[]{-2, 3, -4}));
        }

        @Test
        void shouldReturnOneForPairOfNegativeOnes() {
            assertEquals(1, maximumProductSubarray.maxProduct(new int[]{-1, -1}));
        }

        @Test
        void shouldPickTheLargestSideOfASingleNegative() {
            assertEquals(4, maximumProductSubarray.maxProduct(new int[]{3, -1, 4}));
        }

        @Test
        void shouldDropTheBetterEndWithAnOddNumberOfNegatives() {
            // [-2, -4, 3] = 24 beats [2, -5, -2] = 20
            assertEquals(24, maximumProductSubarray.maxProduct(new int[]{2, -5, -2, -4, 3}));
        }

        @Test
        void shouldDropTheLeadingNegativeWhenThatIsBest() {
            // dropping [2, -3] gives [4, -5, 6, -7] = 840, dropping -7 only gives 720
            assertEquals(840, maximumProductSubarray.maxProduct(new int[]{2, -3, 4, -5, 6, -7}));
        }
    }

    @Nested
    class ZeroCases {
        @Test
        void shouldSkipALeadingZero() {
            assertEquals(2, maximumProductSubarray.maxProduct(new int[]{0, 2}));
        }

        @Test
        void shouldTreatZeroAsASplitPoint() {
            // [2, 3] = 6 vs [4, 5] = 20
            assertEquals(20, maximumProductSubarray.maxProduct(new int[]{2, 3, 0, 4, 5}));
        }

        @Test
        void shouldRestartNegativeTrackingAfterAZero() {
            // [-2, -3] = 6 vs [-4, -5] = 20
            assertEquals(20, maximumProductSubarray.maxProduct(new int[]{-2, -3, 0, -4, -5}));
        }

        @Test
        void shouldNotModifyTheInputArray() {
            int[] nums = {2, 3, -2, 4};
            maximumProductSubarray.maxProduct(nums);
            assertArrayEquals(new int[]{2, 3, -2, 4}, nums);
        }
    }

    @Nested
    class LargeInputs {
        @Test
        void shouldFindSingleLargeValueInMaxLengthArrayOfOnes() {
            int[] nums = new int[20_000];
            Arrays.fill(nums, 1);
            nums[12_345] = 10;
            assertEquals(10, maximumProductSubarray.maxProduct(nums));
        }

        @Test
        void shouldHandleProductNearIntLimit() {
            // 30 consecutive 2s = 2^30 = 1,073,741,824, which fits in an int
            int[] nums = new int[20_000];
            Arrays.fill(nums, 1);
            Arrays.fill(nums, 10_000, 10_030, 2);
            assertEquals(1 << 30, maximumProductSubarray.maxProduct(nums));
        }

        @Test
        void shouldHandleOddLengthArrayOfNegativeOnes() {
            // the whole array multiplies to -1, but any even-length subarray gives 1
            int[] nums = new int[19_999];
            Arrays.fill(nums, -1);
            assertEquals(1, maximumProductSubarray.maxProduct(nums));
        }
    }
}
