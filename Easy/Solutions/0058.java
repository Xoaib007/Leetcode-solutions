class Solution {
    /**
     * Returns the length of the last word in a given string.
     *
     * @param s The input string.
     * @return  The length of the last word.
     */
    public int lengthOfLastWord(String s) {
        char[] reverseSArray = s.toCharArray();

        // Reverse the string
        int left = 0, right = reverseSArray.length - 1;
        while (left < right) {
            char temp = reverseSArray[left];
            reverseSArray[left] = reverseSArray[right];
            reverseSArray[right] = temp;
            left++;
            right--;
        }

        String reversedS = new String(reverseSArray);

        int count = 0;
        int i = 0;

        // Skip trailing spaces
        while (i < reverseSArray.length && reverseSArray[i] == ' ') {
            i++;
        }

        // Count characters until a space or end of string
        while (i < reverseSArray.length && reverseSArray[i] != ' ') {
            count++;
            i++;
        }

        return count;
    }
}
