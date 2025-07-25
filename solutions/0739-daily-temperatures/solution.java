import java.util.SortedMap;
import java.util.TreeMap;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        SortedMap<Integer, Integer> map = new TreeMap<>();
        for (int i = temperatures.length - 1; i >= 0; i--) {
            Integer nearest = findNearest(temperatures[i], map);
            result[i] = nearest == 0 ? 0 : nearest - i;
            map.put(temperatures[i], i);
        }
        return result;
    }

    public Integer findNearest(Integer currentTemp, SortedMap<Integer, Integer> map) {
        return map.tailMap(currentTemp + 1)
                .values().stream()
                .min(Integer::compareTo).orElse(0);
    }
}
