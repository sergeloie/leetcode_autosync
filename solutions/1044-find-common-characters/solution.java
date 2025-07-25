class Solution {
    public List<String> commonChars(String[] words) {
        Map<String, Integer> map = strToMap(words[0]);
        for (String word : words) {
            Map<String, Integer> current = strToMap(word);
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (current.containsKey(entry.getKey())) {
                    entry.setValue(Math.min(entry.getValue(), current.get(entry.getKey())));
                } else {
                    entry.setValue(0);
                }

            }
        }
        return map.entrySet().stream()
                .flatMap(entry -> Stream.generate(entry::getKey).limit(entry.getValue()))
                .toList();
    }

    public Map<String, Integer> strToMap(String word) {
        String[] letters = word.split("");
        Map<String, Integer> result = new HashMap<>();
        for (String letter : letters) {
            result.compute(letter, (key, value) -> value == null ? 1 : value + 1);
        }
        return result;
    }
}
