class Solution {
    /**
     * Determines the sign of the product of an array without computing the product itself.
     * 
     * - If the array contains a zero, the product is zero.
     * - If the count of negative numbers is even, the product is positive (returns 1).
     * - If the count of negative numbers is odd, the product is negative (returns -1).
     *
     * @param nums The integer array.
     * @return     1 if the product is positive, -1 if negative, and 0 if any element is zero.
     */
    public int arraySign(int[] nums) {
        int negativeCount = 0; // Counter for negative numbers

        // Iterate through the array to count negatives and check for zeros
        for (int num : nums) {
            if (num < 0) {
                negativeCount++; // Count negative numbers
            } else if (num == 0) {
                return 0; // If any number is zero, the product is zero
            }
        }

        // If the count of negative numbers is even, return 1 (positive), otherwise return -1 (negative)
        return negativeCount % 2 == 0 ? 1 : -1;
    }
}
