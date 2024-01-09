package problem8;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution8Test {

    Solution8 solution8 = new Solution8();

    @Nested
    class LeetCodeTestCase1 {
        @Test
        void shouldConvertStringToInteger() {
            assertEquals(42, solution8.myAtoi("42"));
        }
    }

    @Nested
    class LeetCodeTestCase2 {
        @Test
        void shouldConvertStringToInteger() {
            assertEquals(-42, solution8.myAtoi("   -42"));
        }
    }

    @Nested
    class LeetCodeTestCase3 {
        @Test
        void shouldConvertStringToInteger() {
            assertEquals(4193, solution8.myAtoi("4193 with words"));
        }
    }
}