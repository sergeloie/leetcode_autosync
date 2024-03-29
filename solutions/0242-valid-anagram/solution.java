import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char si = s.charAt(i);
            char ti = t.charAt(i);
            sMap.computeIfPresent(si, (key, value) -> value + 1);
            tMap.computeIfPresent(ti, (key, value) -> value + 1);
            sMap.putIfAbsent(si, 1);
            tMap.putIfAbsent(ti, 1);
        }
        return sMap.equals(tMap);
    }
}
