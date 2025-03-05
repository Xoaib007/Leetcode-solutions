class Solution {
    /**
     * Computes the number of colored cells in an expanding cross pattern.
     * The pattern follows a sequence where each step adds an expanding layer.
     *
     * @param n The step number in the pattern.
     * @return  The total number of colored cells after n steps.
     */
    public long coloredCells(int n) {
        // The total number of cells follows the formula:
        // Total cells = n^2 + (n-1)^2
        return (long) n * n + (long) (n - 1) * (n - 1);
    }
}
