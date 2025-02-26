class Solution {
    /**
     * Calculates the number of ways to climb a staircase with n steps,
     * where you can take 1 or 2 steps at a time.
     *
     * @param n The number of steps.
     * @return  The number of distinct ways to reach the top.
     */
    public int climbStairs(int n) {
        int ways = 0;
        
        // If n is greater than 1, use Fibonacci approach
        if (n > 1) {
            int[] fibonacciStack = new int[n + 2];
            fibonacciStack[0] = 0;
            fibonacciStack[1] = 1;
            
            for (int i = 2; i < fibonacciStack.length; i++) {
                fibonacciStack[i] = fibonacciStack[i - 1] + fibonacciStack[i - 2];
            }
            
            ways = fibonacciStack[n + 1];
        } else if (n == 0) {
            ways = 0; // No steps to climb
        } else if (n == 1) {
            ways = 1; // Only one way to climb 1 step
        }

        return ways;
    }
}
