class Solution {
    public int[] replaceElements(int[] arr) {
        int maxRight = arr[arr.length - 1];
        arr[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >=0 ; i--) {
            if (arr[i] < maxRight) {
                arr[i] = maxRight;
            } else {
                int temp = arr[i];
                arr[i] = maxRight;
                maxRight = temp;
            }
        }
        return arr;
    }
}
