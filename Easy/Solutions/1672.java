class Solution {
    /**
     * Finds the richest customer by summing the wealth in each bank account.
     *
     * @param accounts A 2D array where accounts[i][j] represents the money customer i has in bank j.
     * @return         The maximum wealth among all customers.
     */
    public int maximumWealth(int[][] accounts) {
        int richest = 0; // Stores the maximum wealth found
        
        // Iterate through each customer's bank accounts
        for (int i = 0; i < accounts.length; i++) {
            int wealth = 0; // Track current customer's total wealth
            
            // Sum up all accounts for the current customer
            for (int j = 0; j < accounts[i].length; j++) {
                wealth += accounts[i][j];
            }
            
            // Update the richest customer if the current wealth is greater
            if (wealth > richest) {
                richest = wealth;
            }
        }

        return richest; // Return the maximum wealth found
    }
}
