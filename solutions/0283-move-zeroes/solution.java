class Solution {
    public void moveZeroes(int[] nums) {
        for (int i = nums.length - 2; i >= 0 ; i--) {
            for (int j = 0; j <= i; j++) {
                if (nums[j] == 0) {
                    nums[j] = nums[j + 1];
                    nums[j + 1] = 0;
                }
            }
        }
    }
}
