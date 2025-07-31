class Solution {
    public int findPermutationDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>(32);
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), i);
        }
        int result = 0;
        for (int i = 0; i < t.length(); i++) {
            result += Math.abs(i - map.get(t.charAt(i)));
        }
        return result;
    }
}
