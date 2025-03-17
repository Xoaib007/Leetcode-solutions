class Solution {
    /**
     * Finds the maximum average of any contiguous subarray of length k.
     *
     * @param nums The input array of integers.
     * @param k The size of the subarray.
     * @return The maximum average as a double.
     */
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        // Step 1: Compute the sum of the first k elements (initial window)
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum; // Store the maximum sum encountered

        // Step 2: Slide the window across the array
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i]; // Remove leftmost element, add new one
            maxSum = Math.max(maxSum, sum); // Update maxSum if needed
        }

        // Step 3: Return the maximum average
        return (double) maxSum / k; // Convert to double for precision
    }
}
