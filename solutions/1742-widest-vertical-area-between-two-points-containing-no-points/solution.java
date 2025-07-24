class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] arr = Arrays.stream(points)
                .map(point -> point[0])
                .mapToInt(Integer::intValue)
                .sorted()
                .toArray();
        int distance = 0;
        int first = arr[0];
        for (int x : arr) {
            distance = Math.max(distance, x - first);
            first = x;

        }
        return distance;
    }
}
