class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int delta = 0;

        for (int i = 1; i < prices.length; i++) {
            delta = Math.max(delta, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        return delta;
    }
}
