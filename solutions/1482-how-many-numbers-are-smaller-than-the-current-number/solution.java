class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        TreeMap<Integer, Long> map = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));
        long count = 0;
        for (Map.Entry<Integer, Long> entry : map.entrySet()) {
            long temp = entry.getValue();
            entry.setValue(count);
            count += temp;
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = map.get(nums[i]).intValue();
        }
        return result;
    }
}
