class Solution {
    /**
     * Counts the number of alternating groups in the array that have at least k consecutive elements.
     * A group is considered alternating if adjacent elements have different values.
     *
     * @param colors The input array representing groups of colors (either 0 or 1).
     * @param k      The minimum size of the alternating group.
     * @return The number of alternating groups of at least size k.
     */
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;

        // Step 1: Create an extended array to simulate circular behavior
        int[] temp = new int[n + k - 1];
        System.arraycopy(colors, 0, temp, 0, n); // Copy original colors to the extended array
        System.arraycopy(colors, 0, temp, n, k - 1); // Copy the first k-1 elements at the end

        int count = 0; // Variable to track the number of alternating groups
        int left = 0;  // Left boundary of the current group
        
        // Step 2: Iterate through the array to count alternating groups of at least size k
        for (int right = 0; right < temp.length; right++) {
            // If the current element is the same as the previous one, reset the left boundary
            if (right > 0 && temp[right] == temp[right - 1]) {
                left = right;  // Start a new group from the current position
            }
            
            // If the length of the group is greater than or equal to k, increment the count
            if (right - left + 1 >= k) {
                count++;
            }
        }

        return count; // Return the total count of alternating groups
    }
}
