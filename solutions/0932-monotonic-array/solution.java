class Solution {
    public boolean isMonotonic(int[] nums) {
        return nums[0] < nums[nums.length - 1] ? isMonotonicInc(nums) : isMonotonicDec(nums);
    }

    public boolean isMonotonicInc(int[] nums) {
        if (nums.length <= 1) {
            return true;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public boolean isMonotonicDec(int[] nums) {
        if (nums.length <= 1) {
            return true;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                return false;
            }
        }
        return true;
    }
}

