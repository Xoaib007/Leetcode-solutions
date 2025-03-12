class Solution {
    /**
     * Determines if it is possible to plant `n` flowers in a given flowerbed
     * without violating the "no adjacent flowers" rule.
     *
     * @param flowerbed An array representing the flowerbed (0 = empty, 1 = occupied).
     * @param n The number of flowers to plant.
     * @return `true` if it's possible to plant `n` flowers, otherwise `false`.
     */
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int possiblePlantation = 0;

        // Special case: Single slot available
        if (flowerbed.length == 1) {
            return flowerbed[0] == 0 && n <= 1;
        }

        // Traverse the flowerbed
        for (int i = 0; i < flowerbed.length; i++) {
            // Check if the current spot is empty and can be planted
            if (flowerbed[i] == 0) {
                // Check the left and right neighbors (handling edge cases)
                boolean leftEmpty = (i == 0) || (flowerbed[i - 1] == 0);
                boolean rightEmpty = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                // If both left and right are empty, plant a flower
                if (leftEmpty && rightEmpty) {
                    flowerbed[i] = 1; // Mark as planted
                    possiblePlantation++;
                    
                    // Optimization: Skip the next index since adjacent planting is not allowed
                    i++;
                }
            }

            // If we've already placed enough flowers, return early
            if (possiblePlantation >= n) {
                return true;
            }
        }

        return false; // Not enough space to plant `n` flowers
    }
}
