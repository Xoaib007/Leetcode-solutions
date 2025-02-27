class Solution {
    /**
     * Finds the extra character that was added to string t.
     *
     * @param s The original string.
     * @param t The modified string with one extra character.
     * @return  The extra character added to t.
     */
    public char findTheDifference(String s, String t) {
        int sumS = 0;
        int sumT = 0;

        // Calculate the sum of ASCII values of characters in string s
        for (int i = 0; i < s.length(); i++) {
            sumS += (int) s.charAt(i);
        }

        // Calculate the sum of ASCII values of characters in string t
        for (int i = 0; i < t.length(); i++) {
            sumT += (int) t.charAt(i);
        }

        // Find the difference between the sums
        int difference = sumT - sumS;

        // Convert ASCII value back to char
        return (char) difference;
    }
}
