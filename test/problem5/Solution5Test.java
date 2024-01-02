package problem5;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution5Test {

    Solution5 solution = new Solution5();

    @Nested
    class LeetcodeTestCase1 {

        @Test
        void shouldReturnLongestPalindromicSubstring() {
            assertEquals("aba", solution.longestPalindrome("babad"));
        }
    }

    @Nested
    class LeetcodeTestCase2 {

        @Test
        void shouldReturnLongestPalindromicSubstring() {
            assertEquals("bb", solution.longestPalindrome("cbbd"));
        }
    }

}