class Solution {
    /**
     * Computes the nth Fibonacci number using an iterative approach.
     * The Fibonacci sequence is defined as:
     * F(0) = 0, F(1) = 1
     * F(n) = F(n-1) + F(n-2) for n >= 2
     *
     * @param n The index of the Fibonacci sequence to compute.
     * @return  The nth Fibonacci number.
     */
    public int fib(int n) {
        // Base cases: F(0) = 0, F(1) = 1
        if (n == 0) return 0;
        if (n == 1) return 1;

        // Variables to store the last two Fibonacci numbers
        int prev2 = 0; // F(n-2)
        int prev1 = 1; // F(n-1)
        int current = 0; // F(n)

        // Compute Fibonacci iteratively from index 2 to n
        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2; // Compute F(n)
            
            // Shift values for the next iteration
            prev2 = prev1;
            prev1 = current;
        }

        return current; // Return the nth Fibonacci number
    }
}
