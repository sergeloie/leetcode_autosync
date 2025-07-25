class Solution {
    public int mySqrt(int x) {
        long l = 0;
        long r = x;
        while (l < r) {
            long mid = l + (r - l + 1) / 2;
            if (mid * mid <= x) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return (int) l;
    }
}
