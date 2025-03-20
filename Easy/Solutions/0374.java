/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return       -1 if num is higher than the picked number
 *               1 if num is lower than the picked number
 *               0 if num is the correct guess
 * int guess(int num);
 */

public class Solution extends GuessGame {
    /**
     * Implements binary search to find the picked number.
     *
     * @param n The upper bound of the number range (1 to n).
     * @return  The picked number.
     */
    public int guessNumber(int n) {
        int low = 1;  // Lower bound of the search space
        int high = n; // Upper bound of the search space

        // Edge case: If n is 1, the answer must be 1
        if (n == 1) {
            return 1;
        }

        // Perform binary search to find the correct number
        while (low <= high) {
            int mid = low + (high - low) / 2; // Prevents integer overflow
            int guessResponse = guess(mid);   // Get response from API

            if (guessResponse == 0) {  
                return mid;  // Found the correct number
            } else if (guessResponse == -1) {
                high = mid - 1; // The picked number is lower, move left
            } else {
                low = mid + 1; // The picked number is higher, move right
            }
        }

        return 0; // Default return (should never be reached)
    }
}
