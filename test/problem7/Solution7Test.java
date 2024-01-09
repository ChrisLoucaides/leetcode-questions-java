package problem7;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution7Test {

    Solution7 solution = new Solution7();

    @Nested
    class LeetCodeTestCase1 {
        @Test
        void shouldReverseInteger() {
            assertEquals(321, solution.reverse(123));
        }
    }

    @Nested
    class LeetCodeTestCase2 {
        @Test
        void shouldReverseInteger() {
            assertEquals(-321, solution.reverse(-123));
        }
    }

    @Nested
    class LeetCodeTestCase3 {
        @Test
        void shouldReverseInteger() {
            assertEquals(21, solution.reverse(120));
        }
    }

    @Nested
    class LeetCodeTestCase4 {
        @Test
        void shouldReverseInteger() {
            assertEquals(0, solution.reverse(0));
        }
    }
}