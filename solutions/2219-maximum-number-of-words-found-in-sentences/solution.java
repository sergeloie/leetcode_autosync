class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxNUmberOfWords = 0;
        for (String str : sentences) {
            maxNUmberOfWords = Math.max(maxNUmberOfWords, wordsCount(str));
        }
        return maxNUmberOfWords;
    }

    public int wordsCount(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            result = str.charAt(i) == ' ' ? result + 1 : result;
        }
        return result + 1;
    }
}
