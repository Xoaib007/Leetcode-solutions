import java.math.BigInteger;

class Solution {
    /**
     * Adds two binary strings and returns the sum as a binary string.
     *
     * @param a The first binary string.
     * @param b The second binary string.
     * @return  The sum of the two binary numbers as a binary string.
     */
    public String addBinary(String a, String b) {
        // Convert binary strings to BigInteger
        BigInteger decimalValueA = new BigInteger(a, 2);
        BigInteger decimalValueB = new BigInteger(b, 2);
        
        // Add the two values
        BigInteger sum = decimalValueA.add(decimalValueB);
        
        // Convert the sum back to a binary string
        return sum.toString(2);
    }
}
