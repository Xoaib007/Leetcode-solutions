class Solution {
    /**
     * Computes the nth Fibonacci number using an iterative approach.
     *
     * @param n The index of the Fibonacci sequence to compute.
     * @return  The nth Fibonacci number.
     */
    public int fib(int n) {
        // Base cases: fib(0) = 0, fib(1) = 1
        if (n == 0) return 0;
        if (n == 1) return 1;

        // Variables to store the last two Fibonacci numbers
        int nthElement = 0;       // Stores the nth Fibonacci number
        int lastElement = 0;      // Stores (n-2)th Fibonacci number
        int secondLastElement = 1; // Stores (n-1)th Fibonacci number

        // Compute Fibonacci iteratively from index 2 to n
        for (int i = 2; i <= n; i++) {
            nthElement = lastElement + secondLastElement; // Compute the next Fibonacci number
            lastElement = secondLastElement; // Shift (n-2)th to (n-1)th
            secondLastElement = nthElement; // Shift (n-1)th to nth
        }

        return nthElement; // Return the nth Fibonacci number
    }
}
