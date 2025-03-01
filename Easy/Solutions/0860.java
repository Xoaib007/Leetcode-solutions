class Solution {
    /**
     * Determines if we can provide the correct change for every customer.
     *
     * - Customers pay with $5, $10, or $20 bills.
     * - We start with no change and must give back $5 when necessary.
     * - Prioritizes giving one $10 + one $5 for $20 payments before giving three $5 bills.
     *
     * @param bills Array representing the sequence of customer payments.
     * @return True if we can provide change for all customers, otherwise False.
     */
    public boolean lemonadeChange(int[] bills) {
        int count5 = 0, count10 = 0; // Track $5 and $10 bills

        // Iterate through customer payments
        for (int bill : bills) {
            if (bill == 5) {
                count5++; // Accept $5 bill, no change needed
            } 
            else if (bill == 10) {
                if (count5 >= 1) { 
                    count5--; // Give back one $5 as change
                    count10++; // Keep the $10 bill
                } else {
                    return false; // Cannot provide change
                }
            } 
            else if (bill == 20) {
                if (count10 >= 1 && count5 >= 1) { 
                    count10--; // Give back one $10
                    count5--; // Give back one $5
                } else if (count5 >= 3) { 
                    count5 -= 3; // Give back three $5 bills
                } else {
                    return false; // Cannot provide change
                }
            }
        }
        
        return true; // Successfully gave change to all customers
    }
}
