class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Long> map = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        long result = map.values().stream()
                .map(x -> x * (x - 1) / 2)
                .reduce(0L, Long::sum);
        return (int) result;
    }
}
