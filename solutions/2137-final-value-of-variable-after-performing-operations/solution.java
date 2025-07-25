class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for (String str : operations) {
            switch (str) {
                case "--X", "X--" -> result = result - 1;
                case "++X", "X++" -> result = result + 1;
            }
        }
        return result;
    }
}
