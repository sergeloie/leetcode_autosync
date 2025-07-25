class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        boolean checkLeft;
        boolean checkRight;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                checkLeft = i == 0 || flowerbed[i - 1] == 0;
                checkRight = i == flowerbed.length - 1 || flowerbed[i + 1] == 0;
                if (checkLeft && checkRight) {
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        return count >= n;
    }
}
