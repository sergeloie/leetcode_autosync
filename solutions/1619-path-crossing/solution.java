class Solution {
    public boolean isPathCrossing(String path) {
        int x = 0;
        int y = 0;
        Set<String> set = new HashSet<>();
        set.add("0,0");
        for (int i = 0; i < path.length(); i++) {
            char ch = path.charAt(i);
            switch (ch) {
                case 'N' -> y++;
                case 'E' -> x++;
                case 'S' -> y--;
                case 'W' -> x--;
            }
            if (!set.add(x + "," + y)) {
                return true;
            }
        }
        return false;
    }
}
