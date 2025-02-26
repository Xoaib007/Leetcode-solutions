class Solution {
    /**
     * Finds the longest common prefix among an array of strings.
     *
     * @param strs The input array of strings.
     * @return     The longest common prefix, or an empty string if none exists.
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        
        String commonPrefix = strs[0]; // Start with the first string as the prefix

        // Iterate through the array to compare prefixes
        for (int i = 1; i < strs.length; i++) {
            // Reduce the commonPrefix until it matches the start of the current string
            while (strs[i].indexOf(commonPrefix) != 0) {
                commonPrefix = commonPrefix.substring(0, commonPrefix.length() - 1);
                if (commonPrefix.isEmpty()) return ""; // No common prefix
            }
        }

        return commonPrefix;
    }
}
