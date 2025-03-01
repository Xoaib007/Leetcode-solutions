import java.util.Arrays;

class Solution {
    /**
     * Finds the largest possible perimeter of a triangle that can be formed
     * using three sides from the given array.
     *
     * @param nums Array of positive integers representing side lengths.
     * @return The largest valid perimeter, or 0 if no valid triangle can be formed.
     */
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums); // Sort the array in ascending order
        int n = nums.length;

        // Start checking from the largest side and move backward
        for (int i = n - 1; i >= 2; i--) {
            // A valid triangle must satisfy: largest side < sum of two smaller sides
            if (nums[i] < nums[i - 1] + nums[i - 2]) {
                return nums[i] + nums[i - 1] + nums[i - 2]; // Return the first valid perimeter found
            }
        }

        return 0; // No valid triangle found
    }
}
