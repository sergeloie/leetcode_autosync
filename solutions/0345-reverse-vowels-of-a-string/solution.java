class Solution {
    public String reverseVowels(String s) {
        int l = 0;
        int r = s.length() - 1;
        Set<String> vowels = Set.of("a", "e", "i", "o", "u", "A", "E", "I", "O", "U");
        List<String> result = Arrays.asList(s.split(""));
        while (l < r) {
            while (l < result.size() && !vowels.contains(result.get(l))) {
                l++;
            }
            while (r >= 0 && !vowels.contains(result.get(r))) {
                r--;
            }
            if (l < r) {
                String temp = result.get(l);
                result.set(l, result.get(r));
                result.set(r, temp);
            }
            l++;
            r--;
        }
        return String.join("", result);
    }
}
