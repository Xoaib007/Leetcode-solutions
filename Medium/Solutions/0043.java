class Solution {
    /**
     * Multiplies two large numbers represented as strings.
     *
     * @param num1 The first number as a string.
     * @param num2 The second number as a string.
     * @return     The product of num1 and num2 as a string.
     */
    public String multiply(String num1, String num2) {
        // If either number is "0", the result is "0"
        if (num1.equals("0") || num2.equals("0")) return "0";

        int len1 = num1.length(), len2 = num2.length();
        int[] result = new int[len1 + len2]; // Array to store multiplication results

        // Multiply each digit from num1 with each digit from num2
        for (int i = len1 - 1; i >= 0; i--) {
            for (int j = len2 - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0'); // Multiply digits
                int sum = mul + result[i + j + 1]; // Add to existing value at position
                
                result[i + j + 1] = sum % 10; // Store the unit digit
                result[i + j] += sum / 10;    // Carry forward to the next position
            }
        }

        // Convert result array to a string, skipping leading zeros
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) { // Skip leading zeros
                sb.append(num);
            }
        }

        return sb.toString();
    }
}
