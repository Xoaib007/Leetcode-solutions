import java.util.Arrays;

class Solution {
    /**
     * Finds the number of successful pairs for each spell.
     * A successful pair is a (spell, potion) pair where 
     * spell * potion >= success.
     *
     * @param spells  Array of spell strengths.
     * @param potions Array of potion strengths.
     * @param success The minimum product required for a successful pair.
     * @return        Array where each element represents the number of successful pairs for the corresponding spell.
     */
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] successPair = new int[spells.length]; // Array to store the results

        // Sort potions in ascending order for binary search
        Arrays.sort(potions);

        // Process each spell to find the number of successful pairs
        for (int i = 0; i < spells.length; i++) {
            int spell = spells[i];

            // Binary search for the first potion that satisfies the condition
            int left = 0, right = potions.length - 1, index = potions.length;

            while (left <= right) {
                int mid = left + (right - left) / 2; // Prevents integer overflow
                
                // Check if the product meets or exceeds the success threshold
                if ((long) spell * potions[mid] >= success) {
                    index = mid;  // Found a valid potion, update index
                    right = mid - 1;  // Look for an earlier valid potion
                } else {
                    left = mid + 1;  // Move to larger potions
                }
            }

            // Number of successful pairs for this spell = total potions - first valid index
            successPair[i] = potions.length - index;
        }

        return successPair;
    }
}
