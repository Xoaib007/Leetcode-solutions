class Solution {
    /**
     * Counts the number of odd numbers in the range [low, high].
     *
     * - If `low` is even, the first odd number is `low + 1`.
     * - If `low` is odd, the first odd number remains `low`.
     * - If `high` is even, the last odd number is `high - 1`.
     * - If `high` is odd, the last odd number remains `high`.
     * - Uses arithmetic progression formula to count odd numbers in the range.
     *
     * @param low  The lower bound of the range.
     * @param high The upper bound of the range.
     * @return     The count of odd numbers in the range.
     */
    public int countOdds(int low, int high) {
        int first = 0, last = 0;

        // Determine the first odd number in the range
        if (low % 2 == 0) {
            first = low + 1;
        } else {
            first = low;
        }

        // Determine the last odd number in the range
        if (high % 2 == 0) {
            last = high - 1;
        } else {
            last = high;
        }

        // Special case: If low and high are the same
        if (high == low) {
            return (high % 2 == 0) ? 0 : 1;
        }

        // Use formula to count odd numbers in the range
        return ((last - first) / 2) + 1;
    }
}
