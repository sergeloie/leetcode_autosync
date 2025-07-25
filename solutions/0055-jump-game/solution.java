class Solution {
public static boolean canJump(int[] nums) {
        boolean isReachable = false;
        int rIndex = nums.length - 1;

        if (rIndex == 0) {
            return true;
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] >= rIndex - i) {
                isReachable = true;
                rIndex = i;
            } else {
                isReachable = false;
            }
        }
        return isReachable;
    }
}
