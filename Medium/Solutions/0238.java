class Solution {
    /**
     * Computes the product of all elements in the array except the current element.
     * Uses prefix and suffix multiplication in O(n) time without using division.
     *
     * @param nums The input array of integers.
     * @return An array where each element is the product of all numbers except itself.
     */
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        
        // Initialize the prefix product array
        ans[0] = 1; 
        
        // Step 1: Compute prefix products
        for (int i = 1; i < nums.length; i++) {
            ans[i] = ans[i - 1] * nums[i - 1]; // Store cumulative prefix product
        }

        // Step 2: Compute suffix product and update answer array
        int suffix = 1; // Initialize suffix product
        for (int i = nums.length - 2; i >= 0; i--) {
            suffix *= nums[i + 1]; // Update suffix product
            ans[i] *= suffix; // Multiply with prefix product stored in ans[]
        }

        return ans; // Return the final result
    }
}
