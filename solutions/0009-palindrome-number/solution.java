class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        if (x <= 9) {
            return true;
        }

        if (x <= 99) {
            return x % 11 == 0;
        }

        int power = (int) Math.log10(x);
        int[] arr = new int[power + 1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = x % 10;
            x = x / 10;
        }

        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - i - 1]) {
                return false;
            }
        }

        return true;
    }
}
