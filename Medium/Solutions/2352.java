class Solution {
    /**
     * Counts the number of pairs where a row in the grid matches a column.
     *
     * @param grid A square matrix of integers.
     * @return The number of pairs where a row is equal to a column.
     */
    public int equalPairs(int[][] grid) {
        int n = grid.length; // Get the size of the grid
        int[][] cols = new int[n][n]; // Array to store columns of the grid
        int pairsCount = 0; // Counter for matching row-column pairs

        // Populate the cols array by transposing the grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cols[j][i] = grid[i][j]; // Store column elements
            }
        }

        // Compare each row with each column
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {  
                boolean isPair = true; // Flag to check if row matches column
                
                // Compare row i with column j
                for (int k = 0; k < n; k++) {
                    if (grid[i][k] != cols[j][k]) {  
                        isPair = false;
                        break; // Exit loop early if mismatch is found
                    }
                }
                
                if (isPair) {
                    pairsCount++; // Increment count if row and column match
                }
            }
        }

        return pairsCount; // Return the total count of matching pairs
    }
}
