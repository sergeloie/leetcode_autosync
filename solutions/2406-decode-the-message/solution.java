class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> map = new HashMap<>();
        int index = 0;
        map.put(' ', ' ');
        for (char ch : key.toCharArray()) {
            if (!map.containsKey(ch)) {
                map.put(ch, (char) ('a' + index++));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : message.toCharArray()) {
            sb.append(map.get(ch));
        }
        return sb.toString();
    }
}
