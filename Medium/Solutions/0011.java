class Solution {
    /**
     * Finds the maximum area of water that can be contained between two vertical lines.
     *
     * @param height An array representing the height of vertical lines.
     * @return The maximum water area that can be contained.
     */
    public int maxArea(int[] height) {
        int left = 0;                 // Left pointer (starting from the first line)
        int right = height.length - 1; // Right pointer (starting from the last line)
        int maxArea = 0;               // Variable to store the maximum area

        // Use two-pointer approach to find the max water container
        while (left < right) {
            // Calculate the area with the current left and right pointers
            int currentArea = Math.min(height[left], height[right]) * (right - left);

            // Update maxArea if we found a larger area
            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer that has the smaller height to try and find a taller container
            if (height[left] < height[right]) {
                left++; // Move left pointer to the right
            } else {
                right--; // Move right pointer to the left
            }
        }

        return maxArea; // Return the largest area found
    }
}
