class Solution {
    public int addDigits(int num) {
        if (num <= 9) return num;
        return addDigits(Arrays.stream(String.valueOf(num).split(""))
                .map(Integer::valueOf).reduce(0, Integer::sum));
    }
}
