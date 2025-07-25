class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> set = new HashSet<>();
        int result = 0;
        for (int num : nums) {
            set.add(num);
        }
        for (Integer num : set) {
            if (set.contains(num + diff) && set.contains(num + diff * 2)) {
                result++;
            }
        }
        return result;
    }
}
