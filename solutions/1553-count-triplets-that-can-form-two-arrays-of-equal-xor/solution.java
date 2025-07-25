class Solution {
    public int countTriplets(int[] arr) {
        int[] xor = new int[arr.length];
        int ans = 0;
        xor[0] = arr[0];
        for (int i = 1; i < xor.length; i++) {
            xor[i] = xor[i - 1] ^ arr[i];
        }
        for (int i = 0; i < xor.length - 1; i++) {
            for (int j = i + 1; j < xor.length; j++) {
                for (int k = j; k < xor.length; k++) {
                    int left_xor = xor[j - 1];
                    if (i - 1 >= 0) {
                        left_xor ^= xor[i - 1];
                    }
                    int right_xor = xor[k] ^ xor[j - 1];
                    if (left_xor == right_xor) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}
