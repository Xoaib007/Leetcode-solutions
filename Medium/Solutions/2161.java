import java.util.ArrayList;
import java.util.List;

class Solution {
    /**
     * Rearranges an array such that:
     * - All elements smaller than pivot come first.
     * - All elements equal to pivot come next.
     * - All elements greater than pivot come last.
     * 
     * The relative order of elements in each group is maintained.
     *
     * @param nums  The input array.
     * @param pivot The pivot value to partition around.
     * @return      The rearranged array.
     */
    public int[] pivotArray(int[] nums, int pivot) {
        // Lists to store elements based on comparison with pivot
        List<Integer> smaller = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> bigger = new ArrayList<>();

        // Partition elements into three lists
        for (int num : nums) {
            if (num < pivot) {
                smaller.add(num);
            } else if (num == pivot) {
                equal.add(num);
            } else { // num > pivot
                bigger.add(num);
            }
        }

        // Reconstruct the nums array from the three lists
        int index = 0;
        for (int num : smaller) nums[index++] = num;
        for (int num : equal) nums[index++] = num;
        for (int num : bigger) nums[index++] = num;

        return nums;
    }
}
