class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {return true;}
        if (t.isEmpty()) {return false;}
        int s_index = 0;
        int t_index = 0;
        do {
            if (s.charAt(s_index) == t.charAt(t_index)) {
                s_index++;
                t_index++;
                if (s_index >= s.length()) {
                    return true;
                }
            } else {
                t_index++;
            }

        } while (s_index < s.length() & t_index < t.length());

        return false;
    }
}
