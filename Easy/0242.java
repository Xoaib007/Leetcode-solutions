/******************************************************************************
Valid Anagram
-------------

Given two strings s and t, return true if t is an 
anagram
 of s, and false otherwise.

 

Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false

 
*******************************************************************************/

class Solution {
    public boolean isAnagram(String s, String t) {
        boolean isAnagram = true;

        char[] sCharArray = new char[s.length()];

        char[] tCharArray = new char[t.length()];

        if(s.length() == t.length()){
            sCharArray = s.toCharArray();
            tCharArray = t.toCharArray();

            Arrays.sort(sCharArray);
            Arrays.sort(tCharArray);

            isAnagram = Arrays.equals(sCharArray, tCharArray);

            
            // for(int i = 0; i < s.length(); i++){
            //     sCharArray.add(s.charAt(i));
            //     tCharArray.add(t.charAt(i));
            // }
            
            // for(int i = 0; i < s.length(); i++){
            //     int matchCount = 0;
            //     for (int j = 0; j < s.length(); j++){
            //         if(s.charAt(i) == t.charAt(j)){
            //             matchCount++;
            //         }
            //     }

            //     if (matchCount == s.length()){
            //         isAnagram = true;
            //     }
            //     else{
            //         isAnagram = false;
            //     }
            // }
        }
        else{
            isAnagram = false;
        }

        



        return isAnagram;
    }
}
