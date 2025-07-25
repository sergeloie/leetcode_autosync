class Solution {
    public int[] transformArray(int[] nums) {
        int evenCount = 0;
        for (int num : nums) {
            evenCount = num % 2 == 0 ? evenCount + 1 : evenCount;
        }
        int[] result = new int[nums.length];
        for (int i = evenCount; i < result.length; i++) {
            result[i] = 1;
        }
        return result;
    }
}
