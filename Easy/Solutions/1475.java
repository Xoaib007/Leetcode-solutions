class Solution {
    /**
     * Computes the final prices after applying discounts.
     * A discount is applied to each price if there exists a future price 
     * that is less than or equal to it, reducing the price by that amount.
     *
     * @param prices An array of item prices.
     * @return The modified prices after applying discounts.
     */
    public int[] finalPrices(int[] prices) {
        // Iterate through each price in the array
        for (int i = 0; i < prices.length; i++) {
            // Look for the first smaller or equal price in the remaining array
            for (int j = i + 1; j < prices.length; j++) { 
                if (prices[j] <= prices[i]) { 
                    prices[i] -= prices[j]; // Apply discount
                    break; // Stop after the first valid discount is found
                }
            }
        }
        return prices; // Return the modified price array
    }
}
