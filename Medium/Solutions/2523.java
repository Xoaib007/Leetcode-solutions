import java.util.*;

class Solution {
    /**
     * Finds the closest pair of prime numbers in the given range [left, right].
     *
     * @param left  The lower bound of the range.
     * @param right The upper bound of the range.
     * @return An array containing the closest prime pair. If no such pair exists, returns [-1, -1].
     */
    public int[] closestPrimes(int left, int right) {
        // Step 1: Generate prime numbers using the Sieve of Eratosthenes
        boolean[] isPrime = new boolean[right + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false; // 0 and 1 are not prime

        for (int i = 2; i * i <= right; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= right; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Step 2: Collect primes in the range [left, right]
        List<Integer> primesInRange = new ArrayList<>();
        for (int i = Math.max(left, 2); i <= right; i++) {
            if (isPrime[i]) {
                primesInRange.add(i);
            }
        }

        // Step 3: Find the closest prime pair
        int minDiff = Integer.MAX_VALUE;
        int[] result = {-1, -1};

        for (int i = 1; i < primesInRange.size(); i++) {
            int diff = primesInRange.get(i) - primesInRange.get(i - 1);
            if (diff < minDiff) {
                minDiff = diff;
                result[0] = primesInRange.get(i - 1);
                result[1] = primesInRange.get(i);
            }
        }

        return result;
    }
}
