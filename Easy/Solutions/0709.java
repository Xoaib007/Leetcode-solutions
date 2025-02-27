class Solution {
    /**
     * Converts all uppercase letters in a string to lowercase.
     *
     * @param s The input string.
     * @return  The lowercase version of the input string.
     */
    public String toLowerCase(String s) {
        char[] sArray = s.toCharArray();
        
        for (int i = 0; i < sArray.length; i++) {
            // Check if the character is an uppercase letter (ASCII 65-90)
            if ((int) sArray[i] >= 65 && (int) sArray[i] <= 90) {
                sArray[i] = (char) ((int) sArray[i] + 32); // Convert to lowercase
            }
        }
        
        return String.valueOf(sArray);
    }
}
