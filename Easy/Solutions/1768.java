class Solution {
    /**
     * Merges two strings alternately, taking one character from each at a time.
     *
     * If one string is longer, the remaining characters are appended at the end.
     *
     * @param word1 The first string.
     * @param word2 The second string.
     * @return      A new string with characters merged alternately.
     */
    public String mergeAlternately(String word1, String word2) {
        String newString = ""; // Stores the merged result
        int highest = Math.max(word1.length(), word2.length()); // Determine the longest string length

        // Iterate through the maximum possible length
        for (int i = 0; i < highest; i++) {
            if (i < word1.length()) {
                newString += word1.charAt(i); // Append character from word1 if available
            }
            if (i < word2.length()) {
                newString += word2.charAt(i); // Append character from word2 if available
            }
        }
        return newString;
    }
}
