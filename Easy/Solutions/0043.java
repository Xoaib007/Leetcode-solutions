class Solution {
    public String multiply(String num1, String num2) {
        // Edge case: If either number is zero, return "0"
        if (num1.equals("0") || num2.equals("0")) return "0";

        int len1 = num1.length(), len2 = num2.length();
        int[] result = new int[len1 + len2]; // Array to store multiplication results

        // Multiply each digit from num1 with each digit from num2
        for (int i = len1 - 1; i >= 0; i--) { // Iterate over num1 from right to left
            for (int j = len2 - 1; j >= 0; j--) { // Iterate over num2 from right to left
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0'); // Multiply digits
                int sum = mul + result[i + j + 1]; // Add product to existing value at position

                result[i + j + 1] = sum % 10; // Store unit digit in result
                result[i + j] += sum / 10;    // Carry forward the tens digit
            }
        }

        // Convert result array to string
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) { // Skip leading zeros
                sb.append(num);
            }
        }

        return sb.toString(); // Return final product as a string
    }
}
