class Solution {
    /**
     * Checks if the given string can be formed by repeating a substring pattern.
     *
     * @param s The input string.
     * @return  True if the string can be constructed by repeating a substring, false otherwise.
     */
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) { // Check if i is a divisor of n
                String substring = s.substring(0, i);
                StringBuilder repeatedSubstring = new StringBuilder(substring);
                
                // Build the repeated substring until it reaches length n
                while (repeatedSubstring.length() < n) {
                    repeatedSubstring.append(substring);
                }
                
                // Check if the constructed string matches the original string
                if (repeatedSubstring.toString().equals(s)) {
                    return true;
                }
            }
        }
        
        return false;
    }
}
