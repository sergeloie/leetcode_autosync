class Solution {
    public int countKDifference(int[] nums, int k) {
        TreeMap<Integer, Long> treeMap = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));
        return treeMap.entrySet().stream()
                .map(entry -> entry.getValue() * treeMap.getOrDefault(entry.getKey() + k, 0L))
                .reduce(0L, Long::sum)
                .intValue();
    }
}
