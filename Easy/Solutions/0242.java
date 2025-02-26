import java.util.Arrays;

class Solution {
    /**
     * Checks if two strings are anagrams of each other.
     *
     * @param s The first string.
     * @param t The second string.
     * @return  True if s and t are anagrams, otherwise false.
     */
    public boolean isAnagram(String s, String t) {
        boolean isAnagram = true;

        // If lengths are different, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();

        // Sort both character arrays
        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);

        // Compare sorted arrays
        isAnagram = Arrays.equals(sCharArray, tCharArray);
        
        return isAnagram;
    }
}
