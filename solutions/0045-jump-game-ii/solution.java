class Solution {
    public int jump(int[] nums) {
        int len = nums.length;
        int[] steps = new int[len];

        for (int i = 0; i < len; i++) {
            int pivot = steps[i];
            int rBound = Math.min(len - 1, nums[i] + i);
                for (int j = i + 1; j <= rBound; j++) {
                    if (steps[j] == 0) {
                        steps[j] = pivot + 1;
                    }
            }
        }

        return steps[len - 1];
    }
}
