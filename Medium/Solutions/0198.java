class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        int prev1 = 0;  // Stores the best money we can get including the last house
        int prev2 = 0;  // Stores the best money we can get excluding the last house

        for (int num : nums) {
            int temp = prev1;  
            prev1 = Math.max(prev1, prev2 + num); // Choose to rob or skip
            prev2 = temp;  // Move to next house
        }

        return prev1;
    }
}
