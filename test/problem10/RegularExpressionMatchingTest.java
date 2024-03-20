package problem10;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegularExpressionMatchingTest {

    RegularExpressionMatching regularExpressionMatching = new RegularExpressionMatching();

    @Nested
    class LeetcodeTestCase1 {
        @Test
        void shouldNotMatchTheEntireString() {
            assertFalse(regularExpressionMatching.isMatch("aa", "a"));
        }
    }

    @Nested
    class LeetcodeTestCase2 {
        @Test
        void shouldMatchTheEntireString() {
            assertFalse(regularExpressionMatching.isMatch("aa", "a*"));
        }
    }

    @Nested
    class LeetcodeTestCase3 {
        @Test
        void shouldMatchTheEntireString() {
            assertFalse(regularExpressionMatching.isMatch("ab", ".*"));
        }
    }
}