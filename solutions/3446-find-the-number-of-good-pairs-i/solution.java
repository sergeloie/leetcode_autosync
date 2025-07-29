class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = nums2[i] * k;
        }
        int result = 0;
        for (int num1 : nums1) {
            for (int num2 : nums2) {
                if (num1 % num2 == 0) {
                    result++;
                }
            }
        }
        return result;
    }
}
