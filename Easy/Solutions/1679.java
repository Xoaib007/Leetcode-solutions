class Solution {
    public int maxOperations(int[] nums, int k) {
        List<Integer> numsList = new ArrayList<>();
        for (int num : nums) {
            numsList.add(num);
        }

        Collections.sort(numsList);

        int left = 0;
        int right = numsList.size() - 1;
        int count = 0;

        while (left < right) {
                int currentSum = numsList.get(left) + numsList.get(right);

                if (currentSum == k) {
                    count++;
                    numsList.remove(right);
                    numsList.remove(left);
                    right -= 2;
                } else if (currentSum < k) {
                left++;
            } else {
                right--;
            }
            }
        
        return count;
    }
}
