class Solution {
    /**
     * Calculates the number of steps required to reduce a number to zero.
     * If the number is even, divide it by 2.
     * If the number is odd, subtract 1.
     *
     * @param num The input number to be reduced.
     * @return    The number of steps required to reach zero.
     */
    public int numberOfSteps(int num) {
        int input = num;  // Copy of the input number
        int stepCount = 0; // Counter to track steps

        // Continue until the number is reduced to zero
        while (input != 0) {
            if (input % 2 == 0) {
                input = input / 2; // If even, divide by 2
            } else {
                input = input - 1; // If odd, subtract 1
            }
            stepCount++; // Increment step count after each operation
        }

        return stepCount; // Return the total number of steps taken
    }
}
