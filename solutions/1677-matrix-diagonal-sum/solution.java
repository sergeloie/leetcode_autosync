class Solution {
    public int diagonalSum(int[][] mat) {
        int lastIndex = mat.length - 1;
        int result = 0;
        
        for (int i = 0; i <= lastIndex; i++) {
            result += mat[i][i];
            result += mat[i][lastIndex - i];
        }
        
        return mat.length % 2 == 0 ? result : result - mat[lastIndex / 2][lastIndex / 2];
    }
}
