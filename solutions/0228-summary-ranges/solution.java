class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) return result;
        int xStart = nums[0];
        int xPrev = nums[0];
        int xCurrent;

        for (int i = 1; i < nums.length; i++) {
            xCurrent = nums[i];
            if (xCurrent - xPrev == 1) {
                xPrev = xCurrent;
            } else {
                if (xPrev == xStart) {
                    result.add(String.valueOf(xStart));
                } else {
                    result.add(xStart + "->" + xPrev);
                }
                xStart = xCurrent;
                xPrev = xCurrent;
            }
        }
        if (xPrev == xStart) {
            result.add(String.valueOf(xStart));
        } else {
            result.add(xStart + "->" + xPrev);
        }
        return result;
    }
}
