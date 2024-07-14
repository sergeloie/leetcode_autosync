class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] mArr = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            int index = magazine.charAt(i) - 'a';
            mArr[index] = mArr[index] + 1;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            int index = ransomNote.charAt(i) - 'a';
            if (mArr[index] == 0) {
                return false;
            } else {
                mArr[index] = mArr[index] - 1;
            }
        }
        return true;
    }
}
