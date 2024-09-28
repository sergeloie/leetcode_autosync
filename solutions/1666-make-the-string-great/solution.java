class Solution {
    public String makeGood(String s) {
        ArrayDeque<Character> arrayDeque = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (!arrayDeque.isEmpty() && arrayDeque.peekLast() == reverseCase(current)) {
                arrayDeque.removeLast();
            } else {
                arrayDeque.add(current);
            }
        }
        System.out.println(arrayDeque);
        StringBuilder sb = new StringBuilder();
        while (!arrayDeque.isEmpty()) {
            sb.append(arrayDeque.pollFirst());
        }
        return sb.toString();
    }

    public char reverseCase(char c) {
        return Character.isLowerCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c);
    }
}
