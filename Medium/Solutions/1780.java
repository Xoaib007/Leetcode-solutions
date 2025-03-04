class Solution {
    /**
     * Checks if a given number can be represented as a sum of distinct powers of three.
     * The number must be expressible using only 0s and 1s in base-3 representation.
     *
     * @param n The number to check.
     * @return  True if n can be represented as a sum of distinct powers of 3, otherwise false.
     */
    public boolean checkPowersOfThree(int n) {
        int remainder; // Stores the remainder when dividing by 3

        // Convert n to base-3 and check if any digit is 2
        while (n > 0) {
            remainder = n % 3; // Get the last digit in base-3
            n = n / 3; // Reduce n by dividing it by 3

            if (remainder == 2) { // If any digit is 2, return false
                return false;
            }
        }

        return true; // If no 2s were found in base-3 representation, return true
    }
}
