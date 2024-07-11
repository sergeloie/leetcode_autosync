class Solution {
    public int balancedStringSplit(String s) {
        int counter = 0;
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            counter = s.charAt(i) == 'L' ? counter - 1 : counter + 1;
            total = counter == 0 ? total + 1 : total;
        }
        return total;
    }
}
