class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        var something1 = Arrays.stream(word1)
                .flatMapToInt(String::chars)
                .boxed()
                .toList();
        var something2 = Arrays.stream(word2)
                .flatMapToInt(String::chars)
                .boxed()
                .toList();
        return something1.equals(something2);
    }
}
