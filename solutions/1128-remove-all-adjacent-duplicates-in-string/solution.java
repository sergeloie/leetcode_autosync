class Solution {
    public String removeDuplicates(String s) {
        ArrayDeque<Character> arrayDeque = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (arrayDeque.peekFirst() != null && arrayDeque.peekFirst() == current) {
                arrayDeque.pop();
            } else {
                arrayDeque.push(current);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!arrayDeque.isEmpty()) {
            sb.append(arrayDeque.pollLast());
        }
        return sb.toString();
    }
}
