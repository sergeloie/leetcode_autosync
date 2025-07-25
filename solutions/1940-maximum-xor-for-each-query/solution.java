class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int[] xor = new int[nums.length];
        int xorBase = (1 << maximumBit) - 1;
        xor[xor.length - 1] = nums[0];
        for (int i = 1; i < xor.length; i++) {
            xor[xor.length - i - 1] = xor[xor.length - i] ^ nums[i];
        }
        for (int i = 0; i < xor.length; i++) {
            xor[i] = xor[i] ^ xorBase;
        }
        return xor;
    }
}
