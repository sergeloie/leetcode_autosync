public class Solution {
    public int lengthOfLongestSubstring(String s) {
        LinkedHashSet linkedHashSet = new LinkedHashSet<>();
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            Character current = s.charAt(i);
            if (linkedHashSet.contains(current)) {
                truncateLHS(linkedHashSet, current);

            }
            linkedHashSet.add(current);
            maxLength = Math.max(maxLength, linkedHashSet.size());
        }
        return maxLength;
    }

    public void truncateLHS(LinkedHashSet<Character> set, Character character) {
        Iterator<Character> iterator = set.iterator();
        while (iterator.hasNext()) {
            Character current = iterator.next();
            if (current.equals(character)) {
                iterator.remove();
                break;
            } else {
                iterator.remove();
            }
        }
    }
}
