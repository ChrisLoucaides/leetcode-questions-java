package problem53;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayTest {

    MaximumSubarray maximumSubarray = new MaximumSubarray();

    @Nested
    class LeetcodeTestCase1 {
        @Test
        void shouldFindTheLargestSumInTheMiddle() {
            // [4, -1, 2, 1] = 6
            assertEquals(6, maximumSubarray.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        }
    }

    @Nested
    class LeetcodeTestCase2 {
        @Test
        void shouldReturnTheOnlyElementForSingleElementArray() {
            assertEquals(1, maximumSubarray.maxSubArray(new int[]{1}));
        }
    }

    @Nested
    class LeetcodeTestCase3 {
        @Test
        void shouldUseTheWholeArrayWhenItHasTheLargestSum() {
            assertEquals(23, maximumSubarray.maxSubArray(new int[]{5, 4, -1, 7, 8}));
        }
    }

    @Nested
    class EdgeCases {
        @Test
        void shouldReturnTheNegativeElementForSingleNegativeElement() {
            assertEquals(-5, maximumSubarray.maxSubArray(new int[]{-5}));
        }

        @Test
        void shouldReturnTheLargestElementWhenAllAreNegative() {
            // subarray must be non-empty, so the answer can't be 0
            assertEquals(-1, maximumSubarray.maxSubArray(new int[]{-3, -1, -2}));
        }

        @Test
        void shouldSumEverythingWhenAllArePositive() {
            assertEquals(15, maximumSubarray.maxSubArray(new int[]{1, 2, 3, 4, 5}));
        }

        @Test
        void shouldReturnZeroWhenAllAreZero() {
            assertEquals(0, maximumSubarray.maxSubArray(new int[]{0, 0, 0}));
        }

        @Test
        void shouldPreferZeroOverNegatives() {
            assertEquals(0, maximumSubarray.maxSubArray(new int[]{-1, 0, -2}));
        }

        @Test
        void shouldHandleMinimumValueSingleElement() {
            assertEquals(-10_000, maximumSubarray.maxSubArray(new int[]{-10_000}));
        }

        @Test
        void shouldHandleMaximumValueSingleElement() {
            assertEquals(10_000, maximumSubarray.maxSubArray(new int[]{10_000}));
        }
    }

    @Nested
    class PositionCases {
        @Test
        void shouldFindBestSubarrayAtTheStart() {
            assertEquals(5, maximumSubarray.maxSubArray(new int[]{5, -10, 1}));
        }

        @Test
        void shouldFindBestSubarrayAtTheEnd() {
            assertEquals(5, maximumSubarray.maxSubArray(new int[]{1, -10, 5}));
        }

        @Test
        void shouldFindBestSingleElementInTheMiddle() {
            assertEquals(7, maximumSubarray.maxSubArray(new int[]{-1, -2, 7, -3, -4}));
        }
    }

    @Nested
    class TrickyCases {
        @Test
        void shouldSpanASmallNegativeWhenItIsWorthIt() {
            // 3 + -1 + 3 = 5 beats either 3 alone
            assertEquals(5, maximumSubarray.maxSubArray(new int[]{3, -1, 3}));
        }

        @Test
        void shouldNotSpanALargeNegative() {
            // 3 + -10 + 3 = -4, so best is a single 3
            assertEquals(3, maximumSubarray.maxSubArray(new int[]{3, -10, 3}));
        }

        @Test
        void shouldKeepAccumulatingAcrossAlternatingSigns() {
            // 2 - 1 + 2 - 1 + 2 = 4
            assertEquals(4, maximumSubarray.maxSubArray(new int[]{2, -1, 2, -1, 2}));
        }

        @Test
        void shouldRestartAfterTheRunningSumGoesNegative() {
            // [4, -1, -2, 1, 5] = 7
            assertEquals(7, maximumSubarray.maxSubArray(new int[]{-2, -3, 4, -1, -2, 1, 5, -3}));
        }

        @Test
        void shouldNotStopAtTheFirstPeak() {
            // running sum peaks at 8, dips, then reaches 21 via [5, -4, 20]
            assertEquals(21, maximumSubarray.maxSubArray(new int[]{8, -19, 5, -4, 20}));
        }

        @Test
        void shouldNotModifyTheInputArray() {
            int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
            maximumSubarray.maxSubArray(nums);
            assertArrayEquals(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}, nums);
        }
    }

    @Nested
    class LargeInputs {
        @Test
        void shouldHandleMaxLengthArrayOfMaxValues() {
            // 100,000 * 10,000 = 1,000,000,000, which fits in an int
            int[] nums = new int[100_000];
            Arrays.fill(nums, 10_000);
            assertEquals(1_000_000_000, maximumSubarray.maxSubArray(nums));
        }

        @Test
        void shouldHandleMaxLengthArrayOfMinValues() {
            int[] nums = new int[100_000];
            Arrays.fill(nums, -10_000);
            assertEquals(-10_000, maximumSubarray.maxSubArray(nums));
        }

        @Test
        void shouldFindSinglePositiveInMaxLengthArrayOfNegatives() {
            int[] nums = new int[100_000];
            Arrays.fill(nums, -1);
            nums[73_421] = 42;
            assertEquals(42, maximumSubarray.maxSubArray(nums));
        }
    }
}
