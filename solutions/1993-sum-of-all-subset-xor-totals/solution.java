class Solution {
    public int subsetXORSum(int[] nums) {
        return (int) Math.pow(2, nums.length - 1) * Arrays.stream(nums).reduce(0, (x, y) -> x | y);
    }
}
