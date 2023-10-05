class Solution {
    public int maxProfit(int[] prices) {
        int end = prices.length - 1;
        int cheapestPrice = prices[0];
        int maxDelta = 0;

        for (int i = 1; i <= end; i++) {
            cheapestPrice = Math.min(cheapestPrice, prices[i]);
            maxDelta = Math.max(maxDelta, prices[i] - cheapestPrice);
        }
        return maxDelta;
    }
}
