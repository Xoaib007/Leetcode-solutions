class Solution {
    /**
     * Checks if an integer is a palindrome.
     *
     * @param x The integer to check.
     * @return  True if x is a palindrome, false otherwise.
     */
    public boolean isPalindrome(int x) {
        int input = x;
        String temp = Integer.toString(input);
        int[] newInput = new int[temp.length()];
        
        // Convert string digits to integer array
        for (int i = 0; i < temp.length(); i++) {
            newInput[i] = temp.charAt(i) - '0';
        }

        Boolean isPalindrom = false;

        // Check for palindrome condition
        if (newInput.length % 2 == 0) {
            for (int i = 0; i < (newInput.length / 2); i++) {
                if (newInput[i] == newInput[newInput.length - (i + 1)]) {
                    isPalindrom = true;
                } else {
                    isPalindrom = false;
                    break;
                }
            }
        } else if (newInput.length % 2 == 1) {
            for (int i = 0; i < ((newInput.length - 1) / 2); i++) {
                if (newInput[i] == newInput[newInput.length - (i + 1)]) {
                    isPalindrom = true;
                } else {
                    isPalindrom = false;
                    break;
                }
            }
        }

        // Special cases
        if (input < 0) {
            isPalindrom = false;
        }
        if (newInput.length == 1) {
            isPalindrom = true;
        }
        
        return isPalindrom;
    }
}
