class Solution {
    /**
     * Computes the Tribonacci number for a given index n.
     * The Tribonacci sequence is defined as:
     * T(0) = 0, T(1) = 1, T(2) = 1
     * T(n) = T(n-1) + T(n-2) + T(n-3) for n >= 3
     *
     * @param n The index of the Tribonacci number.
     * @return  The nth Tribonacci number.
     */
    public int tribonacci(int n) {
        // Base cases for the first three numbers in the sequence
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;

        // Variables to store the last three Tribonacci numbers
        int thirdLast = 0; // T(n-3)
        int secondLast = 1; // T(n-2)
        int last = 1; // T(n-1)
        int current = 0; // T(n)

        // Compute the Tribonacci numbers iteratively from index 3 to n
        for (int i = 3; i <= n; i++) {
            current = last + secondLast + thirdLast; // Compute T(n)

            // Shift values forward for the next iteration
            thirdLast = secondLast;  
            secondLast = last;
            last = current;
        }

        return current; // Return the nth Tribonacci number
    }
}
