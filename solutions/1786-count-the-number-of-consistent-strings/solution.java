class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        Set<String> set = Set.of(allowed.split(""));
        
        for (String word : words) {
            List<String> wordSet = List.of(word.split(""));
            count = set.containsAll(wordSet) ? count + 1 : count;
        }
        return count;
    }
}
