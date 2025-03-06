class Solution {
    /**
     * Finds the missing and repeated values in an n x n grid.
     * The grid contains numbers from 1 to n^2, but one number is missing,
     * and another is repeated.
     *
     * @param grid The n x n grid of numbers.
     * @return An array where [0] is the repeated number and [1] is the missing number.
     */
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n * n;
        int[] count = new int[size + 1]; // To track occurrences of numbers

        int repeated = -1, missing = -1;

        // Count occurrences of each number in the grid
        for (int[] row : grid) {
            for (int num : row) {
                count[num]++;
            }
        }

        // Identify the repeated and missing numbers
        for (int i = 1; i <= size; i++) {
            if (count[i] == 2) {
                repeated = i;
            } else if (count[i] == 0) {
                missing = i;
            }
        }

        return new int[]{repeated, missing};
    }
}
