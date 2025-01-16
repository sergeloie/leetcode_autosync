class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mapS = new HashMap<>();
        Map<Character, Character> mapT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character sKey = s.charAt(i);
            Character tKey = t.charAt(i);

            if (!mapS.containsKey(sKey)) {
                mapS.put(sKey, tKey);
            } else if (!mapS.get(sKey).equals(tKey)) {
                return false;
            }

            if (!mapT.containsKey(tKey)) {
                mapT.put(tKey, sKey);
            } else if (!mapT.get(tKey).equals(sKey)) {
                return false;
            }
        }
        return true;
    }
}
