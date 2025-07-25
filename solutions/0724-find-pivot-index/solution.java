class Solution {
    public int pivotIndex(int[] nums) {
        int[] rightSums = new int[nums.length];
        int rightSum = 0;
        for (int i = nums.length - 1; i >= 0 ; i--) {
            rightSums[i] = rightSum;
            rightSum += nums[i];
        }
        
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (rightSums[i] == leftSum) {
                return i;
            } else {
                leftSum += nums[i];
            }
        }
        return -1;
    }
}
