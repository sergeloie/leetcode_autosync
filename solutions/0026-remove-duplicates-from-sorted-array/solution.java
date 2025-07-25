class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0;
        int r = 1;
        while (r < nums.length) {
            while (nums[l] == nums[r]) {
                r++;
                if (r >= nums.length) {
                    return l + 1;
                }
            }
            nums[++l] = nums[r];
        }
        return l + 1;
    }
}
