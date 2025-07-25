class Solution {
    public String truncateSentence(String s, int k) {
        return s.substring(0, getIndexOfKthSpace(s, k));
    }
    
    public int getIndexOfKthSpace(String s, int k) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                k--;
            }
            if (k == 0) {
                return i;
            }
        }
        return s.length();
    }
}
