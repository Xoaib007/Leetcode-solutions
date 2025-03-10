class Solution {
    /**
     * Finds the maximum profit that can be achieved from buying and selling a stock once.
     * You must buy before you sell.
     *
     * @param prices Array where prices[i] is the stock price on day i.
     * @return The maximum possible profit, or 0 if no profit can be made.
     */
    public int maxProfit(int[] prices) {
        // Initialize min to a very high value to track the lowest buying price
        int min = Integer.MAX_VALUE;
        // Initialize maxProfit to store the highest profit found
        int maxProfit = 0;

        // Iterate through each stock price
        for (int price : prices) {
            // Update min if we find a new lower buying price
            if (price < min) {
                min = price;
            }
            // Calculate potential profit if selling at the current price
            int profit = price - min;
            // Update maxProfit if the current profit is greater than the previous maxProfit
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        // Return the maximum profit found
        return maxProfit;
    }
}
