class Solution {
    /**
     * Moves all zeroes in the array to the end while maintaining the relative order of non-zero elements.
     *
     * @param nums The input array.
     * @return     The modified array with zeroes moved to the end.
     */
    public int[] moveZeroes(int[] nums) {
        int zeroCount = 0;

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++; // Count the number of zeroes
            } else if (zeroCount > 0) {
                // Shift non-zero elements to the left by the number of zeroes encountered so far
                nums[i - zeroCount] = nums[i];
                nums[i] = 0; // Set the current element to zero
            }
        }

        return nums;
    }
}
