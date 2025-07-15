class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            int finalI = i;
            map.compute(ch, (key, value) -> value == null ? finalI : -1);
        }
        for (Integer value : map.values()) {
            if (value != -1) {
                return value;
            }
        }
        return -1;
    }
}
