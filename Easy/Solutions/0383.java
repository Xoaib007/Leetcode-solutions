class Solution {
    /**
     * Determines if the ransom note can be constructed using letters from the magazine.
     *
     * @param ransomNote The string representing the ransom note.
     * @param magazine   The string representing the available characters in the magazine.
     * @return           True if the ransom note can be constructed, otherwise false.
     */
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] counts = new int[26]; // assuming only lowercase English letters are present
        
        // Count the occurrences of each character in magazine
        for (char ch : magazine.toCharArray()) {
            counts[ch - 'a']++;
        }
        
        // Check if we have enough characters in magazine to form ransomNote
        for (char ch : ransomNote.toCharArray()) {
            if (--counts[ch - 'a'] < 0) {
                return false;
            }
        }
        
        return true;
    }
}
