class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int[] prefixSum = new int[52];
        for (int i = 0; i < ranges.length; i++) {
            int start = ranges[i][0];
            int end = ranges[i][1];
            prefixSum[start] = prefixSum[start] + 1;
            prefixSum[end + 1] = prefixSum[end + 1] - 1;
        }
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i] + prefixSum[i - 1];
        }

        for (int i = left; i <=right ; i++) {
            if (prefixSum[i] == 0) {
                return false;
            }
        }
        return true;
    }
}
