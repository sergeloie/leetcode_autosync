class Solution {
    public int maximumCount(int[] nums) {
        return Math.max(getNegIndex(nums) + 1, nums.length - getPosIndex(nums));
    }

    public int getNegIndex(int[] nums) {
        int l = -1;
        int r = nums.length - 1;
        while (l < r) {
            int mid = l + (r - l + 1) / 2;
            if (nums[mid] <= -1) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    public int getPosIndex(int[] nums) {
        int l = 0;
        int r = nums.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] >= 1) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}
