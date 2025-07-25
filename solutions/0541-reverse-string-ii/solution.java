class Solution {
    public String reverseStr(String s, int k) {
        char[] letters = s.toCharArray();
        int lastIndex = letters.length - 1;
        int currentPosition = 0;
        while (currentPosition <= lastIndex) {
            int rightIndex = Math.min(currentPosition + k - 1, lastIndex);
            swap(letters, currentPosition, rightIndex);
            currentPosition += k * 2;
        }
        return new String(letters);
    }

    public void swap(char[] letters, int start, int end) {
        int l = start;
        int r = end;
        while (l < r) {
            char temp = letters[l];
            letters[l] = letters[r];
            letters[r] = temp;
            l++;
            r--;
        }
    }
}
