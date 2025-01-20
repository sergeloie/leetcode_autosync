class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }

        Map<Character, String> map = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++) {
            Character ch = pattern.charAt(i);
            String word = words[i];

            if (!map.containsKey(ch)) {
                if (!map.containsValue(word)) {
                    map.put(ch, word);
                } else {
                    return false;
                }
            } else {
                if (!map.get(ch).equals(word)) {
                    return false;
                }
            }
        }
        return true;
    }
}
