import java.util.Arrays;

class Solution {
    /**
     * Determines if an array can be rearranged to form an arithmetic progression.
     * 
     * An arithmetic progression has a constant difference between consecutive elements.
     *
     * @param arr The integer array to check.
     * @return    True if the array can be arranged as an arithmetic progression, otherwise false.
     */
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr); // Sort the array to check for a common difference

        int diff = arr[1] - arr[0]; // Calculate the common difference
        boolean isArithmeticProgression = false;

        // Check if the difference between consecutive elements is constant
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == diff) {
                isArithmeticProgression = true; // Valid sequence so far
            } else {
                isArithmeticProgression = false; // Difference mismatch, not an arithmetic progression
                break;
            }
        }

        return isArithmeticProgression;
    }
}
