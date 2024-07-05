class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] result = new int[nums.length];
        int leftSum = nums[0];
        int rightSum = nums[nums.length - 1];
        for (int i = 1; i < nums.length; i++) {
            result[i] = leftSum;
            leftSum += nums[i];
        }
        for (int i = nums.length - 2; i >=0 ; i--) {
            result[i] = Math.abs(result[i] - rightSum);
            rightSum += nums[i];
        }
        return result;
    }
}
