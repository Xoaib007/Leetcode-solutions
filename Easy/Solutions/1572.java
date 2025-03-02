class Solution {
    /**
     * Computes the sum of the primary and secondary diagonals of a square matrix.
     * If the matrix has an odd dimension, the center element is only counted once.
     *
     * @param mat The square matrix.
     * @return    The sum of the diagonal elements.
     */
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length; // Get the matrix size

        // Iterate through rows to sum diagonal elements
        for (int i = 0; i < n; i++) {
            sum += mat[i][i]; // Primary diagonal (top-left to bottom-right)
            sum += mat[i][n - 1 - i]; // Secondary diagonal (top-right to bottom-left)
        }

        // If the matrix has an odd dimension, subtract the center element (counted twice)
        if (n % 2 == 1) {
            sum -= mat[n / 2][n / 2];
        }

        return sum;
    }
}
