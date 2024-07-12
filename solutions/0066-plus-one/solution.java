class Solution {
    public int[] plusOne(int[] digits) {
                int[] result = new int[digits.length + 1];
        result[0] = 1;
        int addictor = 1;

        for (int i = result.length - 1; i > 0 ; i--) {
            int current = digits[i - 1] + addictor;
            if (current > 9) {
                result[i] = 0;
                addictor = 1;
            } else {
                result[i] = current;
                addictor = 0;
            }
        }
        return addictor == 0 ? Arrays.copyOfRange(result, 1, result.length) : result;
    }
}
