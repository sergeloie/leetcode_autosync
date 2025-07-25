class Solution {
    public boolean containsDuplicate(int[] nums) {
        long size = nums.length;
        long count = Arrays.stream(nums).distinct().count();
        return count < size;
    }
}
