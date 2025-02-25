class Solution {
    /**
     * Increments the given integer represented as an array of digits by one.
     *
     * @param digits The array representing an integer.
     * @return       The incremented integer as an array.
     */
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Increment the least significant digit by one
        digits[n - 1] += 1;
        
        // Iterate through the digits starting from the least significant
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit becomes 10 after incrementing, set it to 0 and carry over one
            if (digits[i] == 10) {
                digits[i] = 0;
                if (i > 0) {
                    // Carry over one to the next more significant digit
                    digits[i - 1] += 1;
                } else {
                    // If the most significant digit becomes 10, we need to add an extra digit
                    int[] result = new int[n + 1];
                    result[0] = 1; // Set the most significant digit to 1
                    return result;
                }
            } else {
                // If the current digit does not become 10, no need for further processing
                break;
            }
        }
        
        return digits;
    }
}
