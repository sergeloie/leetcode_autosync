class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int sum = n;
        do {
            int[] arr = Arrays.stream(String.valueOf(sum).split("")).mapToInt(Integer::parseInt).toArray();
            sum = 0;
            for (int el : arr) {
                sum += el * el;
            }
            if (!set.add(sum)) {
                return false;
            }
        } while (sum != 1);
        return true;
    }
}
