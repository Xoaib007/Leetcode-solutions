import java.lang.Math;

class Solution {
    /**
     * Reduces the largest pile of gifts k times by replacing it with its square root.
     * Returns the sum of the remaining gifts after k operations.
     *
     * @param gifts An array representing the number of gifts in each pile.
     * @param k The number of times the largest pile is reduced.
     * @return The total number of gifts remaining after k operations.
     */
    public long pickGifts(int[] gifts, int k) {
        int n = gifts.length;

        // Perform the operation k times
        while (k > 0) {  
            int maxIndex = 0;  // Index of the largest pile

            // Find the index of the maximum element in the array
            for (int i = 1; i < n; i++) {
                if (gifts[i] > gifts[maxIndex]) {
                    maxIndex = i;
                }
            }

            // Reduce the largest pile by replacing it with its square root
            gifts[maxIndex] = (int) Math.floor(Math.sqrt(gifts[maxIndex]));

            k--; // Decrease the remaining number of operations
        }

        // Calculate the sum of remaining gifts
        long remainingGifts = 0;
        for (int gift : gifts) {
            remainingGifts += gift;
        }

        return remainingGifts;
    }
}
