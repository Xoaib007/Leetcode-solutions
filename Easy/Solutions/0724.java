class Solution {
    /**
     * Finds the pivot index where the sum of elements to the left is equal to the sum of elements to the right.
     *
     * @param nums An integer array.
     * @return The pivot index, or -1 if no pivot index exists.
     */
    public int pivotIndex(int[] nums) {
        int[] prefix = new int[nums.length]; // Array to store prefix sum
        int[] suffix = new int[nums.length]; // Array to store suffix sum

        int pivotIndex = -1; // Default value if no pivot is found

        // Initialize prefix sum (cumulative sum from left to right)
        prefix[0] = nums[0];
        
        // Initialize suffix sum (cumulative sum from right to left)
        suffix[suffix.length - 1] = nums[nums.length - 1];

        // Compute prefix sum
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        // Compute suffix sum
        for (int i = nums.length - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + nums[i];
        }

        // Find the pivot index
        for (int i = 0; i < nums.length; i++) {
            int leftSum = (i == 0) ? 0 : prefix[i - 1]; // Sum of elements before index `i`
            int rightSum = (i == nums.length - 1) ? 0 : suffix[i + 1]; // Sum of elements after index `i`
            
            if (leftSum == rightSum) { // If left and right sums are equal, `i` is the pivot index
                pivotIndex = i;
                break; // Stop after finding the first pivot index
            }
        }

        return pivotIndex;
    }
}
