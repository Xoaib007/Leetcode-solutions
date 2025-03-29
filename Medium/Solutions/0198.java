class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int robbedSet1 = 0; // Start from house 0
        int robbedSet2 = 0; // Start from house 1

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                robbedSet1 += nums[i]; // Pick even index houses
            } else {
                robbedSet2 += nums[i]; // Pick odd index houses
            }
        }

        return Math.max(robbedSet1, robbedSet2); // Return max of both sets
    }
}
