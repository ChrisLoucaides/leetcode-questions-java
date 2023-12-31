package problem3;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution3Test {

    Solution3 solution = new Solution3();

    @Nested
    class LeetCodeTestCase1 {
        @Test
        void shouldReturnLengthOfLongestSubstring() {
            assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
        }
    }

    @Nested
    class LeetCodeTestCase2 {
        @Test
        void shouldReturnLengthOfLongestSubstring() {
            assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
        }
    }

    @Nested
    class LeetCodeTestCase3 {
        @Test
        void shouldReturnLengthOfLongestSubstring() {
            assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
        }
    }

    @Nested
    class LeetCodeTestCase4 {
        @Test
        void shouldReturnLengthOfLongestSubstring() {
            assertEquals(2, solution.lengthOfLongestSubstring("aab"));
        }
    }

    @Nested
    class LeetCodeTestCase5 {
        @Test
        void shouldReturnLengthOfLongestSubstring() {
            assertEquals(3, solution.lengthOfLongestSubstring("dvdf"));
        }
    }

}