class Solution {
    public int minimumOperations(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result = num % 3 == 0 ? result : result + 1;
        }
        return result;
    }
}
