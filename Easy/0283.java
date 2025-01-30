/******************************************************************************
Move Zeroes
-----------

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
*******************************************************************************/

class Solution {
    public int[] moveZeroes(int[] nums) {
        int zeroCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else if (zeroCount > 0) {
                // Shift non-zero elements to the left by the number of zeroes encountered so far
                nums[i - zeroCount] = nums[i];
                nums[i] = 0; // Set the current element to zero
            }
        }

        return nums;
    }
}
