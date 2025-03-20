import java.util.Arrays;

class Solution {
    /**
     * Determines if two words are "close" based on character transformation rules.
     * 
     * Two words are considered close if:
     * 1. They contain the same unique characters.
     * 2. They have the same frequency distribution (even if characters swap).
     *
     * @param word1 First input string.
     * @param word2 Second input string.
     * @return True if the words are close, otherwise false.
     */
    public boolean closeStrings(String word1, String word2) {
        // Step 1: If lengths differ, they can never be close
        if (word1.length() != word2.length()) return false;

        // Step 2: Frequency arrays for both words
        int[] freq1 = new int[26]; // Stores frequency of characters in word1
        int[] freq2 = new int[26]; // Stores frequency of characters in word2

        // Populate frequency arrays
        for (char c : word1.toCharArray()) freq1[c - 'a']++;
        for (char c : word2.toCharArray()) freq2[c - 'a']++;

        // Step 3: Check if both words contain the same unique characters
        for (int i = 0; i < 26; i++) {
            if ((freq1[i] == 0 && freq2[i] != 0) || (freq1[i] != 0 && freq2[i] == 0)) {
                return false; // If one word has a character the other doesn't, return false
            }
        }

        // Step 4: Sort frequency arrays and compare
        Arrays.sort(freq1);
        Arrays.sort(freq2);

        // Step 5: If frequency distributions match, words are close
        return Arrays.equals(freq1, freq2);
    }
}
