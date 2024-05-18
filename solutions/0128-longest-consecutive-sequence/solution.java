import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Set<Integer> set = new TreeSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int sizeMax = 0;
        int count = 1;

        Iterator<Integer> iterator = set.iterator();
        int begin = iterator.next();

        while (iterator.hasNext()) {
            int current = iterator.next();
            if (begin + 1 == current) {
                count++;
            } else {
                sizeMax = Math.max(sizeMax, count);
                count = 1;
            }
            begin = current;
        }
        return Math.max(sizeMax, count);
    }
}
