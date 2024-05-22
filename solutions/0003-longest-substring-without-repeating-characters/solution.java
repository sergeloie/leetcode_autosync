public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        Set<Character> set = new HashSet<>();
        int leftIndex = 0;
        int rightIndex = 1;
        int lastIndex = s.length() - 1;
        int maxSize = 1;
        set.add(s.charAt(0));

        while (rightIndex <= lastIndex) {
            char current = s.charAt(rightIndex);
            if (set.contains(current)) {
                do {
                    set.remove(s.charAt(leftIndex));
//                    leftIndex++;
                } while (s.charAt(leftIndex++) != current);
            }
            set.add(current);
            rightIndex++;
            maxSize = Math.max(maxSize, set.size());
        }
        return maxSize;
    }
}
