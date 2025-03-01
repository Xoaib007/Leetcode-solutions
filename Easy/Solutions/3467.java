import java.util.Arrays;

class Solution {
    /**
     * Transforms an array by replacing each number with its remainder when divided by 2.
     * Then, sorts the transformed array.
     *
     * @param nums The input integer array.
     * @return A sorted array of 0s (even) and 1s (odd).
     */
    public int[] transformArray(int[] nums) {
        int[] transformed = new int[nums.length];

        // Convert each number to 0 (even) or 1 (odd)
        for (int i = 0; i < nums.length; i++) {
            transformed[i] = nums[i] % 2;
        }

        // Sort the transformed array (all 0s first, then 1s)
        Arrays.sort(transformed);

        return transformed;
    }
}
