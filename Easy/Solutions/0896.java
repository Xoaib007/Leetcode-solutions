class Solution {
    /**
     * Determines if an array is monotonic (either entirely non-increasing or non-decreasing).
     * 
     * - A sequence is increasing if each element is >= the previous one.
     * - A sequence is decreasing if each element is <= the previous one.
     * 
     * @param nums The integer array to check.
     * @return     True if the array is monotonic, otherwise false.
     */
    public boolean isMonotonic(int[] nums) {
        boolean increasing = true;  // Assume array is non-decreasing
        boolean decreasing = true;  // Assume array is non-increasing

        // Iterate through the array and check the trend
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                decreasing = false; // If an increase is found, it's not non-increasing
            } else if (nums[i] < nums[i - 1]) {
                increasing = false; // If a decrease is found, it's not non-decreasing
            }
        }

        // The array is monotonic if it's either entirely non-decreasing or non-increasing
        return increasing || decreasing;
    }
}
