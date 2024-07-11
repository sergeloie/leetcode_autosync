class Solution {
    public void reverseString(char[] s) {
        int lastIndex = s.length - 1;
        int limitIndex = s.length / 2 - 1;
        for (int i = 0; i <= limitIndex; i++) {
            char temp = s[i];
            s[i] = s[lastIndex - i];
            s[lastIndex - i] = temp;
        }
    }
}
