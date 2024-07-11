class Solution {
    public int differenceOfSums(int n, int m) {
        boolean condition = true;
        Map<Boolean, Integer> partitionedSum = IntStream.rangeClosed(1, n)
                .boxed()
                .collect(Collectors.partitioningBy(
                        i -> condition == (i % m == 0), Collectors.summingInt(Integer::intValue)));
        return partitionedSum.get(false) - partitionedSum.get(true);
    }
}
