class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sArr = strToArr(s);
        int[] tArr = strToArr(t);
        return Arrays.equals(sArr, tArr);
    }

    public int[] strToArr(String str) {
        int[] arr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 'a';
            arr[index] = arr[index] + 1;
        }
        return arr;
    }
}
