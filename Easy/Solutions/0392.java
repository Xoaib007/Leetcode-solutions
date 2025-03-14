class Solution {
    /**
     * Determines if string `s` is a subsequence of string `t`.
     * A subsequence means `s` can be derived from `t` by deleting some characters
     * without changing the order of remaining characters.
     *
     * @param s The subsequence string to check.
     * @param t The target string where `s` may appear as a subsequence.
     * @return `true` if `s` is a subsequence of `t`, otherwise `false`.
     */
    public boolean isSubsequence(String s, String t) {
        int i = 0; // Pointer for `s`
        int j = 0; // Pointer for `t`

        // Traverse `t` to find all characters of `s` in order
        while (j < t.length()) {
            if (i < s.length() && s.charAt(i) == t.charAt(j)) { 
                i++; // Move to the next character in `s` if matched
            }
            j++; // Always move in `t`
        }

        return i == s.length(); // If `i` reached `s.length()`, all characters were found in order
    }
}
