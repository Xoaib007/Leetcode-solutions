/******************************************************************************
Find the Index of the First Occurrence in a String
--------------------------------------------------

Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
*******************************************************************************/

class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0; // An empty needle is always found at index 0
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            boolean found = true;

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
