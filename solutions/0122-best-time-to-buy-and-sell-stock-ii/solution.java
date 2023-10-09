class Solution {
    public int maxProfit(int[] prices) {
        int end = prices.length - 1;
        boolean isBuyed = false;
        int maxProfit = 0;
        int buyDay = 0;
        int sellDay = 0;
        for (int i = 0; i < end; i++) {
            if (isBuyed && prices[i] > prices[buyDay] && prices[i] > prices[i + 1]) {
                isBuyed = false;
                maxProfit += prices[i] - prices[buyDay];
            }

            if (!isBuyed && prices[i] < prices[i + 1]) {
                isBuyed = true;
                buyDay = i;
            }
        }
        if (isBuyed && prices[end] - prices[buyDay] > 0) {
            maxProfit += prices[end] - prices[buyDay];
        }
        return maxProfit;
    }
}
