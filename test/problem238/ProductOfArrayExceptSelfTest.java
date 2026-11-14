package problem238;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelfTest {

    ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();

    @Nested
    class LeetcodeTestCase1 {
        @Test
        void shouldReturnProductOfAllOtherElements() {
            assertArrayEquals(new int[]{24, 12, 8, 6},
                    productOfArrayExceptSelf.productExceptSelf(new int[]{1, 2, 3, 4}));
        }
    }

    @Nested
    class LeetcodeTestCase2 {
        @Test
        void shouldOnlyBeNonZeroAtTheIndexOfTheSingleZero() {
            assertArrayEquals(new int[]{0, 0, 9, 0, 0},
                    productOfArrayExceptSelf.productExceptSelf(new int[]{-1, 1, 0, -3, 3}));
        }
    }

    @Nested
    class EdgeCases {
        @Test
        void shouldSwapValuesForTwoElements() {
            assertArrayEquals(new int[]{7, 3},
                    productOfArrayExceptSelf.productExceptSelf(new int[]{3, 7}));
        }

        @Test
        void shouldReturnAllOnesWhenInputIsAllOnes() {
            assertArrayEquals(new int[]{1, 1, 1, 1},
                    productOfArrayExceptSelf.productExceptSelf(new int[]{1, 1, 1, 1}));
        }

        @Test
        void shouldReturnSameLengthAsInput() {
            assertEquals(5, productOfArrayExceptSelf.productExceptSelf(new int[]{1, 2, 3, 4, 5}).length);
        }

        @Test
        void shouldReturnPositivesWhenEachAnswerMultipliesAnEvenNumberOfNegatives() {
            assertArrayEquals(new int[]{6, 3, 2},
                    productOfArrayExceptSelf.productExceptSelf(new int[]{-1, -2, -3}));
        }

        @Test
        void shouldHandleMixedSigns() {
            assertArrayEquals(new int[]{-12, 8, -6},
                    productOfArrayExceptSelf.productExceptSelf(new int[]{2, -3, 4}));
        }

        @Test
        void shouldHandleConstraintBoundaryValues() {
            // 30^5 = 24,300,000, which fits in an int
            int[] expected = new int[6];
            Arrays.fill(expected, 24_300_000);
            assertArrayEquals(expected,
                    productOfArrayExceptSelf.productExceptSelf(new int[]{30, 30, 30, 30, 30, 30}));
        }

        @Test
        void shouldHandleNegativeBoundaryValues() {
            // (-30)^5 = -24,300,000
            int[] expected = new int[6];
            Arrays.fill(expected, -24_300_000);
            assertArrayEquals(expected,
                    productOfArrayExceptSelf.productExceptSelf(new int[]{-30, -30, -30, -30, -30, -30}));
        }
    }

    @Nested
    class ZeroCases {
        @Test
        void shouldHandleZeroAtTheStart() {
            assertArrayEquals(new int[]{24, 0, 0, 0},
                    productOfArrayExceptSelf.productExceptSelf(new int[]{0, 2, 3, 4}));
        }

        @Test
        void shouldHandleZeroAtTheEnd() {
            assertArrayEquals(new int[]{0, 0, 0, 6},
                    productOfArrayExceptSelf.productExceptSelf(new int[]{1, 2, 3, 0}));
        }

        @Test
        void shouldReturnAllZerosWhenThereAreTwoZeros() {
            assertArrayEquals(new int[]{0, 0, 0, 0},
                    productOfArrayExceptSelf.productExceptSelf(new int[]{0, 2, 0, 4}));
        }

        @Test
        void shouldReturnAllZerosWhenEveryElementIsZero() {
            assertArrayEquals(new int[]{0, 0},
                    productOfArrayExceptSelf.productExceptSelf(new int[]{0, 0}));
        }

        @Test
        void shouldReturnOtherElementForTwoElementsWithOneZero() {
            assertArrayEquals(new int[]{5, 0},
                    productOfArrayExceptSelf.productExceptSelf(new int[]{0, 5}));
        }
    }

    @Nested
    class TrickyCases {
        @Test
        void shouldHandleDuplicateValues() {
            assertArrayEquals(new int[]{4, 4, 4},
                    productOfArrayExceptSelf.productExceptSelf(new int[]{2, 2, 2}));
        }

        @Test
        void shouldNotModifyTheInputArray() {
            int[] nums = {1, 2, 3, 4};
            productOfArrayExceptSelf.productExceptSelf(nums);
            assertArrayEquals(new int[]{1, 2, 3, 4}, nums);
        }
    }

    @Nested
    class LargeInputs {
        @Test
        void shouldHandleMaxLengthArray() {
            // all 1s except a single 2 in the middle: every answer is 2, except at the 2 itself
            int[] nums = new int[100_000];
            Arrays.fill(nums, 1);
            nums[50_000] = 2;

            int[] expected = new int[100_000];
            Arrays.fill(expected, 2);
            expected[50_000] = 1;

            assertArrayEquals(expected, productOfArrayExceptSelf.productExceptSelf(nums));
        }

        @Test
        void shouldTrackSignAcrossMaxLengthArrayOfNegativeOnes() {
            // 100,000 copies of -1: each answer is the product of 99,999 copies of -1, which is -1
            int[] nums = new int[100_000];
            Arrays.fill(nums, -1);

            int[] expected = new int[100_000];
            Arrays.fill(expected, -1);

            assertArrayEquals(expected, productOfArrayExceptSelf.productExceptSelf(nums));
        }
    }
}
