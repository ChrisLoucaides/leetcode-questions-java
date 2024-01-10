package problem9;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution9Test {

    Solution9 solution = new Solution9();

    @Nested
    class LeetcodeTestCase1 {
        @Test
        void shouldReturnTrueIfPalindrome() {
            assertTrue(solution.isPalindrome(121));
        }
    }

    @Nested
    class LeetcodeTestCase2 {
        @Test
        void shouldReturnFalseIfNotPalindrome() {
            assertFalse(solution.isPalindrome(-121));
        }
    }

    @Nested
    class LeetcodeTestCase3 {
        @Test
        void shouldReturnFalseIfNotPalindrome() {
            assertFalse(solution.isPalindrome(-121));
        }
    }
    @Nested
    class LeetcodeTestCase4 {
        @Test
        void shouldReturnFalseIfNotPalindrome() {
            assertTrue(solution.isPalindrome(3443));
        }
    }

}