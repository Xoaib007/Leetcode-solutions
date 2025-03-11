class Solution {
    /**
     * Counts the number of substrings containing at least one occurrence
     * of the characters 'a', 'b', and 'c'.
     *
     * @param s The input string consisting of characters 'a', 'b', and 'c'.
     * @return The total number of valid substrings.
     */
    public int numberOfSubstrings(String s) {
        int count = 0;  // Stores the total number of valid substrings
        int left = 0;   // Left pointer for the sliding window
        int[] charCount = new int[3];  // Array to count occurrences of 'a', 'b', and 'c'

        // Expand the window with the right pointer
        for (int right = 0; right < s.length(); right++) {
            // Increase the count of the current character
            charCount[s.charAt(right) - 'a']++;

            // When all three characters are present in the current window
            while (charCount[0] > 0 && charCount[1] > 0 && charCount[2] > 0) {
                // Every substring starting from 'left' to the end is valid
                count += s.length() - right;
                // Shrink the window from the left
                charCount[s.charAt(left) - 'a']--;
                left++;
            }
        }

        return count;
    }
}
