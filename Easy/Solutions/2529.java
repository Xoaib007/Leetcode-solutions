class Solution {
    /**
     * Finds the maximum count of either positive or negative numbers in the sorted array.
     * Zeros are ignored in the count.
     *
     * @param nums A sorted integer array (can contain negative, zero, and positive numbers).
     * @return The maximum count between positive and negative numbers.
     */
    public int maximumCount(int[] nums) {
        int countPositive = 0; // Stores count of positive numbers
        int countNegative = 0; // Stores count of negative numbers
        int index = 0; // Pointer to traverse the array

        // Count negative numbers (all negatives appear before zeros and positives)
        while (index < nums.length && nums[index] < 0) {
            countNegative++;
            index++;
        }

        // Skip zeros (since they do not contribute to either count)
        while (index < nums.length && nums[index] == 0) {
            index++;
        }

        // Remaining elements in the array are positive numbers
        countPositive = nums.length - index;

        // Return the maximum count between positive and negative numbers
        return Math.max(countPositive, countNegative);
    }
}
