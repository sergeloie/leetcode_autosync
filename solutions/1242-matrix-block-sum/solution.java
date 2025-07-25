class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] prefix = new int[m][n];
        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int cell = mat[i][j];
                boolean hasUp = i > 0;
                boolean hasLeft = j > 0;
                cell = hasUp ? cell + prefix[i - 1][j] : cell;
                cell = hasLeft ? cell + prefix[i][j - 1] : cell;
                cell = hasUp && hasLeft ? cell - prefix[i - 1][j - 1] : cell;
                prefix[i][j] = cell;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int rowCorner = Math.min(m - 1, i + k);
                int columnCorner = Math.min(n - 1, j + k);
                int rowUp = i - k - 1;
                int columnLeft = j - k - 1;

                int subUp = rowUp >= 0 ? prefix[rowUp][columnCorner] : 0;
                int subLeft = columnLeft >= 0 ? prefix[rowCorner][columnLeft] : 0;
                int sum = (rowUp >=0 && columnLeft >= 0) ? prefix[rowUp][columnLeft] : 0;

                result[i][j] = prefix[rowCorner][columnCorner] - subUp - subLeft + sum;
            }
        }
        return result;
    }
}
