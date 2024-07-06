class Solution {
    public int findLengthOfLCIS(int[] nums) {
                int previous = nums[0];
        int current;
        int count = 1;
        int maxCount = 1;

        for (int i = 1; i < nums.length; i++) {
            current = nums[i];
            if (current > previous) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 1;
            }
            previous = current;
        }
        return Math.max(maxCount, count);
    }
}
