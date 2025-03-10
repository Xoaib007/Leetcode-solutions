class Solution {
    /**
     * Counts substrings of length `k` that contain all vowels ('a', 'e', 'i', 'o', 'u') at least once.
     *
     * @param word The input string.
     * @param k The required number of non-vowel characters in the substring.
     * @return The count of valid substrings.
     */
    public long countOfSubstrings(String word, int k) {
        int[][] frequencies = new int[2][128]; // ASCII frequency array
        frequencies[0]['a'] = 1;
        frequencies[0]['e'] = 1;
        frequencies[0]['i'] = 1;
        frequencies[0]['o'] = 1;
        frequencies[0]['u'] = 1;

        long count = 0;
        int currentK = 0, vowelCount = 0, extraLeft = 0;

        // Sliding window technique
        for (int right = 0, left = 0; right < word.length(); right++) {
            char rightChar = word.charAt(right);

            // If the character is a vowel, track its frequency
            if (frequencies[0][rightChar] == 1) {
                if (++frequencies[1][rightChar] == 1) vowelCount++; // Count unique vowels
            } else {
                currentK++; // Count non-vowel characters
            }

            // Shrink the window if the non-vowel count exceeds `k`
            while (currentK > k) {
                char leftChar = word.charAt(left);
                if (frequencies[0][leftChar] == 1) {
                    if (--frequencies[1][leftChar] == 0) vowelCount--; // Remove vowel from tracking
                } else {
                    currentK--; // Decrease non-vowel count
                }
                left++;
                extraLeft = 0; // Reset `extraLeft` as window size is changing
            }

            // Adjust `extraLeft` to count substrings with duplicate vowels
            while (vowelCount == 5 && currentK == k && left < right && frequencies[0][word.charAt(left)] == 1 && frequencies[1][word.charAt(left)] > 1) {
                extraLeft++;
                frequencies[1][word.charAt(left)]--;
                left++;
            }

            // If the window meets conditions, add valid substrings
            if (currentK == k && vowelCount == 5) {
                count += (1 + extraLeft);
            }
        }

        return count;
    }
}
