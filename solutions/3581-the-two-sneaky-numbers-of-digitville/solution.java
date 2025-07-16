class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int[] result = new int[2];
        int index = 0;
        for (int num : nums) {
            if (!set.add(num)) {
                result[index++] = num;
            }
        }
        return result;
    }
}
