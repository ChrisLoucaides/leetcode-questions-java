package problem6;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution6Test {

    Solution6 solution = new Solution6();

    @Nested
    class LeetCodeTestCase1 {
        @Test
        void shouldReturnNumberOfRows() {
            assertEquals("PAHNAPLSIIGYIR", solution.convert("PAYPALISHIRING", 3));
        }
    }

    @Nested
    class LeetCodeTestCase2 {
        @Test
        void shouldReturnNumberOfRows() {
            assertEquals("PINALSIGYAHRPI", solution.convert("PAYPALISHIRING", 4));
        }
    }

    @Nested
    class LeetCodeTestCase3 {
        @Test
        void shouldReturnNumberOfRows() {
            assertEquals("A", solution.convert("A", 1));
        }
    }
}