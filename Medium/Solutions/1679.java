import java.util.Arrays;

class Solution {
    /**
     * Finds the maximum number of operations where two numbers sum to k.
     *
     * @param nums The input array of integers.
     * @param k The target sum.
     * @return The maximum number of valid operations.
     */
    public int maxOperations(int[] nums, int k) {
        // Step 1: Sort the array to use the two-pointer approach
        Arrays.sort(nums);
        
        int left = 0;                // Left pointer (smallest value)
        int right = nums.length - 1; // Right pointer (largest value)
        int count = 0;               // Count of valid operations

        // Step 2: Use two-pointer approach to find pairs
        while (left < right) {
            int currentSum = nums[left] + nums[right];

            if (currentSum == k) {
                count++;  // Found a valid pair
                left++;   // Move left pointer forward
                right--;  // Move right pointer backward
            } else if (currentSum < k) {
                left++;   // Increase sum by moving left pointer forward
            } else {
                right--;  // Decrease sum by moving right pointer backward
            }
        }

        return count; // Return the total count of operations
    }
}
