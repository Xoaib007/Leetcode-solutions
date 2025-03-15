class Solution {
    /**
     * Finds the highest altitude reached after applying altitude gains.
     * The altitude starts at 0, and `gain[i]` represents the net gain/loss at step `i`.
     *
     * @param gain An integer array where each element represents altitude change.
     * @return The highest altitude reached.
     */
    public int largestAltitude(int[] gain) {
        int highest = 0; // Stores the maximum altitude reached
        int current = 0; // Tracks the current altitude

        // Iterate through the gain array to compute altitude at each step
        for (int i = 0; i < gain.length; i++) {
            current += gain[i]; // Update the current altitude
            highest = Math.max(highest, current); // Update highest altitude if needed
        }

        return highest; // Return the maximum altitude reached
    }
}
