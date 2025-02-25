class Solution {
    /**
     * Computes the integer square root of a given number using binary search.
     *
     * @param x The input number.
     * @return  The integer square root of x.
     */
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x; // Edge cases: sqrt(0) = 0, sqrt(1) = 1
        }

        int low = 1, high = x;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Prevents overflow

            // Use long to prevent overflow when multiplying
            long square = (long) mid * mid;

            if (square == x) {
                return mid; // Perfect square
            } else if (square < x) {
                ans = mid; // Store potential answer
                low = mid + 1; // Search higher values
            } else {
                high = mid - 1; // Search lower values
            }
        }

        return ans; // Return the largest integer whose square is ≤ x
    }
}
