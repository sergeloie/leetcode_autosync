class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        if (firstList.length == 0 || secondList.length == 0) {
            return new int[0][];
        }

        List<Integer> starts = new ArrayList<>();
        List<Integer> finishes = new ArrayList<>();
        for (int i = 0; i < firstList.length; i++) {
            starts.add(firstList[i][0]);
            finishes.add(firstList[i][1]);
        }
        for (int j = 0; j < secondList.length; j++) {
            starts.add(secondList[j][0]);
            finishes.add(secondList[j][1]);
        }
        starts.sort(Comparator.naturalOrder());
        finishes.sort(Comparator.naturalOrder());

        List<Integer> points = new ArrayList<>();

        for (int i = 1; i < starts.size(); i++) {
            if (starts.get(i) <= finishes.get(i - 1)) {
                points.add(starts.get(i));
                points.add(finishes.get(i - 1));
            }
        }

        if (points.isEmpty()) {
            return new int[0][];
        }

        int[][] result = new int[points.size() / 2][2];

        int count = 0;
        for (int i = 0; i < result.length; i++) {
            result[i][0] = points.get(count++);
            result[i][1] = points.get(count++);
        }

        return result;
    }
}
