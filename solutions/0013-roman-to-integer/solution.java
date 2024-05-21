public class Solution {
    public int romanToInt(String s) {
        int[] numbers = new int[s.length()];
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char romeNumber = s.charAt(i);
            numbers[i] = switch (romeNumber) {
                case 'I' -> 1;
                case 'V' -> 5;
                case 'X' -> 10;
                case 'L' -> 50;
                case 'C' -> 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> 0;
            };
        }

        result += numbers[numbers.length - 1];

        for (int i = numbers.length - 2; i >= 0; i--) {
            if (numbers[i] < numbers[i+1]) {
                result -= numbers[i];
            } else {
                result += numbers[i];
            }
        }
        return result;
    }
}
