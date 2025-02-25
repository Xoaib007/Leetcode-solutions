import java.util.*;

class Solution {
    /**
     * Converts a Roman numeral string to an integer.
     *
     * @param s The Roman numeral string.
     * @return  The integer representation of the Roman numeral.
     */
    public int romanToInt(String s) {
        // Map to store Roman numeral values
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        // Iterate through the string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = romanMap.get(s.charAt(i));
            
            // If current value is smaller than previous, subtract it; otherwise, add it
            if (currValue < prevValue) {
                result -= currValue;
            } else {
                result += currValue;
            }
            
            prevValue = currValue;
        }

        return result;
    }
}
