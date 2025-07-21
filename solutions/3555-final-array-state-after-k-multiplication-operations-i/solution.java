class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        TreeMap<Integer, TreeSet<Integer>> map = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(nums[i], num -> new TreeSet<>()).add(i);
        }
        for (int i = 1; i <= k; i++) {
            Map.Entry<Integer, TreeSet<Integer>> entry = map.firstEntry();
            int multipliedValue = entry.getKey() * multiplier;
            int index = entry.getValue().removeFirst();
            map.computeIfAbsent(multipliedValue, num -> new TreeSet<>()).add(index);
            if (entry.getValue().isEmpty()) {
                map.remove(entry.getKey());
            }
        }
        int[] result = new int[nums.length];
        for (Map.Entry<Integer, TreeSet<Integer>> entry : map.entrySet()) {
            for(Integer index : entry.getValue()) {
                result[index] = entry.getKey();
            }
        }
        return result;
    }
}
