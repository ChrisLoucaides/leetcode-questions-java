package problem121;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {

    BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();

    @Nested
    class LeetcodeTestCase1 {
        @Test
        void shouldBuyOnDayTwoAndSellOnDayFive() {
            assertEquals(5, bestTimeToBuyAndSellStock.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        }
    }

    @Nested
    class LeetcodeTestCase2 {
        @Test
        void shouldReturnZeroWhenPricesOnlyDecrease() {
            assertEquals(0, bestTimeToBuyAndSellStock.maxProfit(new int[]{7, 6, 4, 3, 1}));
        }
    }

    @Nested
    class EdgeCases {
        @Test
        void shouldReturnZeroForSingleDay() {
            assertEquals(0, bestTimeToBuyAndSellStock.maxProfit(new int[]{5}));
        }

        @Test
        void shouldReturnZeroWhenAllPricesAreEqual() {
            assertEquals(0, bestTimeToBuyAndSellStock.maxProfit(new int[]{3, 3, 3, 3}));
        }

        @Test
        void shouldBuyFirstDayAndSellLastDayWhenPricesOnlyIncrease() {
            assertEquals(4, bestTimeToBuyAndSellStock.maxProfit(new int[]{1, 2, 3, 4, 5}));
        }

        @Test
        void shouldHandleTwoDaysWithProfit() {
            assertEquals(3, bestTimeToBuyAndSellStock.maxProfit(new int[]{1, 4}));
        }

        @Test
        void shouldHandleZeroPrices() {
            assertEquals(10000, bestTimeToBuyAndSellStock.maxProfit(new int[]{0, 10000}));
        }
    }

    @Nested
    class TrickyCases {
        @Test
        void shouldNotSellBeforeBuyingEvenIfMaxComesBeforeMin() {
            assertEquals(2, bestTimeToBuyAndSellStock.maxProfit(new int[]{9, 2, 4, 1}));
        }

        @Test
        void shouldUseLaterLowerMinimumWhenItGivesBiggerProfit() {
            assertEquals(9, bestTimeToBuyAndSellStock.maxProfit(new int[]{3, 8, 1, 10}));
        }

        @Test
        void shouldKeepEarlierProfitWhenLaterMinimumGivesSmallerProfit() {
            assertEquals(7, bestTimeToBuyAndSellStock.maxProfit(new int[]{2, 9, 1, 3}));
        }
    }
}
