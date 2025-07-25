class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Long> map = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        long count = map.values().stream()
                .distinct()
                .count();
        return count == map.size();
    }
}
