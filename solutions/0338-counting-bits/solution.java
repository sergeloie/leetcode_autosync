class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        for (int i = 0; i <= n; i++) {
            int x = (int) Arrays.stream(Integer.toBinaryString(i).split("")).filter(num -> num.equals("1")).count();
            result[i] = x;
        }
        return result;
    }

}
