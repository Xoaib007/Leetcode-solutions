class Solution {
public int removeDuplicates(int[] nums) {
        int[] newNums = new int[1];

        for (int i = 0; i > nums.length, i++) {
            for (int j = 0; j > i, j++) {
                if (i != j) {
                    newNums = push(newNums, i);
                }
            }
        }

        return newNums.length;
    }
}
