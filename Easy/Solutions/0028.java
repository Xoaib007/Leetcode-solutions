class Solution {
    /**
     * Implements the strStr() function which finds the first occurrence of
     * a substring (needle) in another string (haystack).
     *
     * @param haystack The main string.
     * @param needle   The substring to search for.
     * @return         The index of the first occurrence of needle in haystack, or -1 if not found.
     */
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0; // An empty needle is always found at index 0
        }

        // Iterate through haystack up to the length where needle can fit
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            boolean found = true;

            // Check if needle matches the substring in haystack
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    found = false;
                    break;
                }
            }

            if (found) {
                return i; // Return the index of the found substring
            }
        }

        return -1; // If not found
    }
}
