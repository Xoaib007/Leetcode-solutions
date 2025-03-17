import java.util.*;

class Solution {
    /**
     * Finds the unique elements in each array that do not appear in the other.
     *
     * @param nums1 The first integer array.
     * @param nums2 The second integer array.
     * @return A list containing two lists:
     *         - The first list contains elements unique to `nums1`.
     *         - The second list contains elements unique to `nums2`.
     */
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> nums1Diff = new ArrayList<>(); // Stores unique elements from nums1
        List<Integer> nums2Diff = new ArrayList<>(); // Stores unique elements from nums2

        // Find elements in nums1 that are not in nums2
        for (int i = 0; i < nums1.length; i++) {
            boolean isDifferent = true;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    isDifferent = false; // Element exists in both arrays
                    break;
                }
            }
            if (isDifferent && !nums1Diff.contains(nums1[i])) { // Ensure uniqueness
                nums1Diff.add(nums1[i]);
            }
        }

        // Find elements in nums2 that are not in nums1
        for (int i = 0; i < nums2.length; i++) {
            boolean isDifferent = true;
            for (int j = 0; j < nums1.length; j++) {
                if (nums2[i] == nums1[j]) {
                    isDifferent = false;
                    break;
                }
            }
            if (isDifferent && !nums2Diff.contains(nums2[i])) { // Ensure uniqueness
                nums2Diff.add(nums2[i]);
            }
        }

        // Return result as a list of lists
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(nums1Diff);
        answer.add(nums2Diff);
        return answer;
    }
}
