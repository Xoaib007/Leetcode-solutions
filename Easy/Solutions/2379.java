class Solution {
    /**
     * Finds the minimum number of white ('W') blocks to recolor 
     * in order to obtain a substring of length k with only black ('B') blocks.
     *
     * @param blocks The given string consisting of 'B' and 'W'.
     * @param k      The length of the substring that should contain only 'B'.
     * @return The minimum number of recoloring operations required.
     */
    public int minimumRecolors(String blocks, int k) {
        int minOperations = k; // The worst-case scenario: all k blocks need to be changed
        int whiteCount = 0;    // Tracks the number of 'W' in the current window

        // Step 1: Count 'W' blocks in the first window of size k
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                whiteCount++;
            }
        }
        minOperations = whiteCount;

        // Step 2: Slide the window through the string
        for (int i = k; i < blocks.length(); i++) {
            // Remove the leftmost character from the previous window
            if (blocks.charAt(i - k) == 'W') {
                whiteCount--;
            }
            // Add the new character to the current window
            if (blocks.charAt(i) == 'W') {
                whiteCount++;
            }
            // Update the minimum operations needed
            minOperations = Math.min(minOperations, whiteCount);
        }

        return minOperations;
    }
}
