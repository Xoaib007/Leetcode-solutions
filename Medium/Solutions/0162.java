class Solution {
    /**
     * Finds a peak element in the given array.
     * A peak element is an element that is greater than its neighbors.
     * It is guaranteed that the array contains at least one peak.
     *
     * @param nums An array of integers where adjacent elements are distinct.
     * @return The index of any peak element.
     */
    public int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1; // Initialize search space

        // Perform binary search
        while (right > left) {
            int mid = left + (right - left) / 2; // Prevents integer overflow

            // If mid is greater than the next element, the peak is in the left half
            if (nums[mid] > nums[mid + 1]) {
                right = mid; // Move towards the peak
            } else {
                left = mid + 1; // Move right as peak must be ahead
            }
        }

        return left; // Left (or right) will eventually point to a peak element
    }
}
