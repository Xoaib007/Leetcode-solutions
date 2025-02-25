class Solution {
    /**
     * Removes all occurrences of a given value in-place.
     *
     * @param nums The integer array.
     * @param val  The value to remove.
     * @return     The new length of the modified array.
     */
    public int removeElement(int[] nums, int val) {
        int k = 0; // Position to place the non-val elements

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) { // If element is not the target value
                nums[k] = nums[i]; // Move it forward
                k++;
            }
        }
        
        return k; // New length of modified nums array
    }
}
