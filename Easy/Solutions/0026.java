class Solution {
    /**
     * Removes duplicates from a sorted array in-place.
     *
     * @param nums The sorted integer array.
     * @return     The number of unique elements in the array.
     */
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1; // Index for unique elements
        
        // Iterate through the array
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { // Found a new unique element
                nums[k] = nums[i]; // Move it forward
                k++;
            }
        }

        return k; // New length of unique elements
    }
}
