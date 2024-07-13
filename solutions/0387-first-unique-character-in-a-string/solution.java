class Solution {
    public int firstUniqChar(String s) {
        String[] strArr = s.split("");
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strArr.length; i++) {
            int finalI = i;
            map.compute(strArr[i], (k, v) -> v == null ? finalI : Integer.MAX_VALUE);
        }
        int result =  map.values().stream().min(Integer::compareTo).get();
        return result == Integer.MAX_VALUE ? -1 : result;
    }
}
