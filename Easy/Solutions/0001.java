class Solution {
    /**
     * Finds indices of two numbers that add up to the target.
     *
     * @param nums   Array of integers.
     * @param target Target sum to find.
     * @return       Indices of the two numbers.
     */
    public int[] twoSum(int[] nums, int target) {
        // Iterate through each element in the array
        for (int i = 0; i < nums.length - 1; i++) {
            // Check for a pair that sums to the target
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j}; // Return indices of the two numbers
                }
            }
        }
        // Throw an exception if no valid pair is found
        throw new IllegalArgumentException("No two sum solution");
    }
}

