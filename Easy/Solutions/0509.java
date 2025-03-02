class Solution {
    public int fib(int n) {
        // Base cases: fib(0) = 0, fib(1) = 1
        if (n == 0) return 0;
        if (n == 1) return 1;

        // Variables to store the last two Fibonacci numbers
        int nthElement = 0;
        int lastElement = 0;
        int secondLastElement = 1;

        // Compute Fibonacci iteratively
        for (int i = 2; i <= n; i++) {
            nthElement = lastElement + secondLastElement; // Calculate the next Fibonacci number
            lastElement = secondLastElement; // Move to the next position
            secondLastElement = nthElement;
        }

        return nthElement; // Return the nth Fibonacci number
    }
}
