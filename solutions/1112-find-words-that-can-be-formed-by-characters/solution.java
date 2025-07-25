class Solution {
    public int countCharacters(String[] words, String chars) {
        Map<String, Long> source = strToMap(chars);
        int count = 0;
        for (String word : words) {
            if (canConstruct(source, strToMap(word))) {
                count += word.length();
            }
        }
        return count;
    }

    public Map<String, Long> strToMap(String word) {
        return Arrays.stream(word.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public boolean canConstruct(Map<String, Long> source, Map<String, Long> target) {
        for (Map.Entry<String, Long> entry : target.entrySet()) {
            String key = entry.getKey();
            if (source.get(key) == null || source.get(key) < entry.getValue()) {
                return false;
            }
        }
        return true;
    }
}
