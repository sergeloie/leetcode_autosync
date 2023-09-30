class Solution {
    public int removeDuplicates(int[] nums) {
        int size = nums.length;
        if (size < 3) {
            return size;
        }

        int l = 1;
        int r = 2;

        while (r < size) {
            if (nums[l - 1] == nums[l] && nums[l] == nums[r]) {
                r++;
            } else {
                nums[l + 1] = nums[r];
                l++;
                r++;
            }
        }

        return l + 1;
    }
}
