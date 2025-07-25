class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        while (true) {
            char ethalon;
            try {
                ethalon = strs[0].charAt(count);
            } catch (StringIndexOutOfBoundsException e) {
                return sb.toString();
            }
            for (int i = 1; i < strs.length; i++) {
                char current;
                try {
                    current = strs[i].charAt(count);
                } catch (StringIndexOutOfBoundsException e) {
                    return sb.toString();
                }
                if (!(ethalon == current)) {
                    return sb.toString();
                }
            }
            sb.append(ethalon);
            count++;
        }
    }
}
