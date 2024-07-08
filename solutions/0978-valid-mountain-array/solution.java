class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length <= 2) {
            return false;
        }

        int l = 0;
        int r = arr.length - 1;

        while ((l <= arr.length - 2) && (arr[l] < arr[l + 1])) {
            l++;
        }

        while ((r >= 1) && (arr[r] < arr[r - 1])) {
            r--;
        }
        if (l == 0 || r == arr.length - 1) {
            return false;
        }
        return l == r;
    }
}
