class Solution {
    public String reverseWords(String s) {
        String s1 = s.trim();
        String[] arr = s1.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]).append(" ");
        }
        return sb.toString().trim();
    }
}
