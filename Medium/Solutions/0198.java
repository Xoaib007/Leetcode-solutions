class Solution {
    public int rob(int[] nums) {
        int money = 0;

        if (nums.length == 2) {
            if (nums[0] > nums[1]) {
                return nums[0];
            } else {
                return nums[1];
            }
        }

        if (nums.length == 3) {
            if (nums[0] + nums[2] > nums[1]) {
                return nums[0] + nums[2];
            } else {
                return nums[1];
            }
        }

        int totalHouse = nums.length;
        int houseIndex1 = 0;

        int robbedSet1 = 0;
        while (houseIndex1 <= totalHouse - 1) {
            robbedSet1 += nums[houseIndex1];
            houseIndex1 += 2;
        }

         int houseIndex2 = 1;

        int robbedSet2 = 0;
        while (houseIndex2 <= totalHouse - 1) {
            robbedSet2 += nums[houseIndex2];
            houseIndex2 += 2;
        }

        if(robbedSet1 < robbedSet2) {
       money = robbedSet2;
    }else {
       money = robbedSet1;
    }

        return money;
    }
}
