class Solution {
    /**
     * Calculates the sum of the primary and secondary diagonals of a square matrix.
     * If the matrix has only one element, returns that element.
     *
     * @param mat The square matrix.
     * @return    The sum of the diagonal elements.
     */
    public int diagonalSum(int[][] mat) {
        int sum = 0; // Initialize sum to store diagonal elements' sum

        // Iterate through the matrix
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                // Check if the element belongs to the primary or secondary diagonal
                if (i == j || i + j == mat.length - 1) {
                    sum += mat[i][j]; // Add the diagonal element to sum
                }
            }
        }

        // Special case: If the matrix has only one element, return it directly
        if (mat.length == 1) sum = mat[0][0];

        return sum; // Return the computed diagonal sum
    }
}
