class Solution {
    /**
     * Finds the index at which the target should be inserted in a sorted array.
     * 
     * @param nums   Input sorted array of integers.
     * @param target Target value to find or insert.
     * @return       Index where the target is found or should be inserted.
     */
    public int searchInsert(int[] nums, int target) {
        int k = 0;
        
        // Check if the target exists in the array
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return i; // Return the index immediately if target is found
            }
        }

        // If target is not found, determine the insertion position
        if (target < nums[0]) {
            return 0; // Insert at the beginning
        } else if (target > nums[nums.length - 1]) {
            return nums.length; // Insert at the end
        } else {
            // Find the correct position to insert
            for (int i = 0; i < nums.length - 1; i++) {
                if (target > nums[i] && target < nums[i + 1]) {
                    return i + 1; // Insert between nums[i] and nums[i+1]
                }
            }
        }
        
        return k;
    }
}
