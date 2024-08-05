class Solution {
    public void moveZeroes(int[] nums) {
        int zero = 0;
        int notZero = 0;
        while (zero < nums.length && notZero < nums.length) {
            while (zero < nums.length && nums[zero] != 0) {
                zero++;
            }
            notZero = zero;
            while (notZero < nums.length && nums[notZero] == 0) {
                notZero++;
            }
            if (zero < nums.length && notZero < nums.length) {
                nums[zero] = nums[notZero];
                nums[notZero] = 0;
            }
        }
    }
}
