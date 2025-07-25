class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hashMap = Arrays.stream(strs)
                .collect(Collectors.groupingBy(this::sortWord, Collectors.toList()));
        return hashMap.values().stream().toList();
    }

    public String sortWord(String word) {
        return Arrays.stream(word.split(""))
                .sorted()
                .collect(Collectors.joining());
    }
    
}
