class Solution {
    public int findMiddleIndex(int[] nums) {
        int[] rightSum = new int[nums.length];
        for (int i = nums.length - 2; i >= 0 ; i--) {
            rightSum[i] = rightSum[i + 1] + nums[i + 1];
        }
        int leftSum = 0;
        for (int i = 0; i < rightSum.length; i++) {
            if (rightSum[i] == leftSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
