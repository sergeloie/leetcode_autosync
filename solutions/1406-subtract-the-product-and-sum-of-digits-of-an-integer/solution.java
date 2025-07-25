class Solution {
    public int subtractProductAndSum(int n) {
        var result = Arrays.stream(String.valueOf(n).split("")).map(Integer::valueOf).toList();
        return result.stream().reduce(1, (x, y) -> x * y) - result.stream().reduce(0, Integer::sum);
    }
}
