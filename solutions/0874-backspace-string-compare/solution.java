class Solution {
    public boolean backspaceCompare(String s, String t) {
        ArrayDeque<Character> sStack = new ArrayDeque<>();
        ArrayDeque<Character> tStack = new ArrayDeque<>();
        fillStack(s, sStack);
        fillStack(t, tStack);
        return sStack.toString().equals(tStack.toString());
    }

    public void fillStack(String string, ArrayDeque<Character> arrayDeque) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '#') {
                arrayDeque.pollLast();
            } else {
                arrayDeque.addLast(string.charAt(i));
            }
        }
    }
}
