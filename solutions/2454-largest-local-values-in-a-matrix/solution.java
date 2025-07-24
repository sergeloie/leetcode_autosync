class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] offset = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};
        int[][] result = new int[n - 2][n - 2];
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                int max = getMax(grid, offset, i, j);
                result[i - 1][j - 1] = max;
            }
        }
        return result;
    }

    private int getMax(int[][] array, int[][] offset, int row, int column) {
        int max = array[row][column];
        for (int i = 0; i < offset.length; i++) {
            int dummy = array[row + offset[i][0]][column + offset[i][1]];
            max = Math.max(max, dummy);
        }
        return max;
    }
    
}
