class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for(List<Integer> num : nums) {
            treeMap.compute(num.getFirst(), (k, v) -> v == null ? 1 : v + 1);
            treeMap.compute(num.getLast(), (k, v) -> v == null ? -1 : v - 1);
        }
        int previousValue = 0;
        int start = 0;
        int sum = 0;

        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            int currentEdge = entry.getKey();
            int currentValue = previousValue + entry.getValue();
            if (previousValue < 1) {
                start = currentEdge;
            }
            if (currentValue == 0) {
                sum += currentEdge - start + 1;
            }
            previousValue = currentValue;
        }
        return sum;
    }
}
