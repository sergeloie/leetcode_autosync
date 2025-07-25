class Solution {
    public int majorityElement(int[] nums) {
        int i = nums.length / 2;
        Arrays.sort(nums);
        return nums[i];
    }
}
