import java.util.*;

class Solution {
    /**
     * Modifies the given matrix by setting entire rows and columns to zero if an element is zero.
     * 
     * - Uses the first row and first column as markers to track which rows and columns should be set to zero.
     * - Avoids using extra space beyond the existing matrix structure.
     * 
     * @param matrix The input 2D integer matrix.
     */
    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean firstRowZero = false, firstColZero = false;

        // Check if the first row contains a zero
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }

        // Check if the first column contains a zero
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        // Use first row & first column as markers for zero locations
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0; // Mark corresponding row
                    matrix[0][j] = 0; // Mark corresponding column
                }
            }
        }

        // Set matrix elements to zero based on markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Set entire first row to zero if originally marked
        if (firstRowZero) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        // Set entire first column to zero if originally marked
        if (firstColZero) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
