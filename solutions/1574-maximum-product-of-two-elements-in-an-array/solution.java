class Solution {
    public int maxProduct(int[] nums) {
        int maxUp = Math.max(nums[0], nums[1]);
        int maxDown = Math.min(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            int candidate = nums[i];
            if (candidate > maxUp) {
                maxDown = maxUp;
                maxUp = candidate;
            } else if (candidate > maxDown) {
                maxDown = candidate;
            }
        }
        return (maxUp - 1) * (maxDown - 1);
    }
}
