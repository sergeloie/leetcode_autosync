class Solution {
    public int[][] transpose(int[][] matrix) {
        int resultRowLength = matrix[0].length;
        int resultColumnLength = matrix.length;
        int[][] result = new int[resultRowLength][resultColumnLength];
        for (int i = 0; i < resultRowLength; i++) {
            for (int j = 0; j < resultColumnLength; j++) {
                result[i][j] = matrix[j][i];
            }
        }
        return result;
    }
}
