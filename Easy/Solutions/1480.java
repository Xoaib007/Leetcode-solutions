class Solution {
    /**
     * Computes the running sum of an array.
     * The running sum at index i is the sum of all elements from index 0 to i.
     *
     * @param nums The input array of integers.
     * @return     A new array where each element at index i is the sum of elements from index 0 to i.
     */
    public int[] runningSum(int[] nums) {
        int[] newArray = new int[nums.length]; // Array to store the running sum
        newArray[0] = nums[0]; // First element remains the same

        // Loop through the array to calculate the running sum
        for (int i = 1; i < nums.length; i++) {
            int sum = 0;
            int count = i;

            // Calculate the sum of elements from index 0 to i
            while (count >= 0) {
                sum += nums[count];
                count--;
            }

            newArray[i] = sum; // Store the running sum at index i
        }

        return newArray; // Return the result array
    }
}
