import java.util.ArrayList;
import java.util.List;

class Solution {
    /**
     * Determines if the frequency of occurrences of numbers in the array is unique.
     *
     * @param arr The input array of integers.
     * @return true if all occurrence counts are unique, false otherwise.
     */
    public boolean uniqueOccurrences(int[] arr) {
        List<Integer> arrList = new ArrayList<>(); // Stores unique numbers

        // Extract unique numbers from the array
        for (int num : arr) {
            if (!arrList.contains(num)) { // Avoid duplicates
                arrList.add(num);
            }
        }

        List<Integer> repeatCount = new ArrayList<>(); // Stores occurrence counts

        // Count occurrences for each unique number
        for (int i = 0; i < arrList.size(); i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) { // Iterate through original array
                if (arrList.get(i) == arr[j]) {
                    count++;
                }
            }
            repeatCount.add(count); // Store count of occurrences
        }

        boolean isUnique = true; // Flag to check uniqueness

        // Check if occurrence counts are unique
        outerLoop:
        for (int i = 0; i < repeatCount.size(); i++) {
            for (int j = i + 1; j < repeatCount.size(); j++) { // Compare each count
                if (repeatCount.get(i).equals(repeatCount.get(j))) { // If duplicate count found
                    isUnique = false;
                    break outerLoop; // Exit both loops immediately
                }
            }
        }

        return isUnique;
    }
}
