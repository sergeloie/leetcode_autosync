class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        int[] leftProd = new int[length + 2];
        int[] rightProd = new int[length + 2];
        int lastIndex = length + 1;
        leftProd[0] = 1;
        leftProd[1] = 1;
        rightProd[lastIndex] = 1;
        rightProd[lastIndex - 1] = 1;


        for (int i = 2; i <= lastIndex; i++) {
            leftProd[i] = nums[i - 2] * leftProd[i - 1];
            rightProd[lastIndex - i] = nums[lastIndex - i] * rightProd[lastIndex +1 - i];
        }

        for (int i = 0; i < result.length; i++) {
            result[i] = leftProd[i + 1] * rightProd[i + 1];
        }

        return result;
    }
}
