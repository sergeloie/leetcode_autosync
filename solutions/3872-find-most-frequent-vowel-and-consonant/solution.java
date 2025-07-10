class Solution {
    public int maxFreqSum(String s) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        int vowelsFreqMax = 0;
        int consonantFreqMax = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.compute(s.charAt(i), (key, value) -> value == null ? 1 : value + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (vowels.contains(entry.getKey())) {
                vowelsFreqMax = Math.max(vowelsFreqMax, entry.getValue());
            } else {
                consonantFreqMax = Math.max(consonantFreqMax, entry.getValue());
            }
        }
        return vowelsFreqMax + consonantFreqMax;
    }
}
