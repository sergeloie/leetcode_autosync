class Solution {
    public int[] decompressRLElist(int[] nums) {
        int[] result = IntStream.range(0, nums.length / 2)
            .flatMap(i -> IntStream.generate(() -> nums[i * 2 + 1])
                    .limit(nums[i * 2]))
            .toArray();
        return result;
    }
}
