/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l = 1;
        int r = n;
        int mid = 0;
        int result = 0;
        do {
            mid = r - (r - l) / 2;
            result = guess(mid);
            switch (result) {
                case -1 -> r = mid - 1;
                case 1 -> l = mid + 1;
            }
        } while (result != 0);
        return mid;
    }
}
