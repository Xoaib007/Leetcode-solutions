class Solution {
    /**
     * Solves the House Robber problem using dynamic programming.
     * Determines the maximum amount that can be robbed without alerting the police.
     *
     * @param nums An array where nums[i] represents the money at house i.
     * @return The maximum money that can be robbed without robbing adjacent houses.
     */
    public int rob(int[] nums) {
        // Edge cases for small inputs
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        int prev1 = 0;  // Stores the max money robbed including the last house considered
        int prev2 = 0;  // Stores the max money robbed excluding the last house considered

        // Iterate through each house
        for (int num : nums) {
            int temp = prev1;  
            prev1 = Math.max(prev1, prev2 + num); // Decide to rob current house or skip it
            prev2 = temp;  // Move to the next house
        }

        return prev1; // Final max profit
    }
}
