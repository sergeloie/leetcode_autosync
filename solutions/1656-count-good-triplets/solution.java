class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int lastIndex = arr.length - 1;
        int result = 0;
        for (int k = 2; k <= lastIndex ; k++) {
            for (int j = 1; j < k; j++) {
                for (int i = 0; i < j; i++) {
                    if (Math.abs(arr[i] - arr[j]) <= a
                            && Math.abs(arr[j] - arr[k]) <= b
                            && Math.abs(arr[i] - arr[k]) <= c
                    ) {
                        result++;
                    }
                }
            }

        }
        return result;
    }
}
