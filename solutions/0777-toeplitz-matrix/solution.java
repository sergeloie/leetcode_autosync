class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        final int lastRowIndex = matrix.length - 1;
        final int lastColumnIndex = matrix[0].length - 1;
//        С нижней строки пойдём вверх, до главной диагонали
        for (int i = lastRowIndex; i >= 0 ; i--) {
            int row = i;
            int column = 0;
            int controlNumber = matrix[row][column];
            while (row <= lastRowIndex && column <= lastColumnIndex) {
                if (matrix[row][column] != controlNumber) {
                    return false;
                }
                row++;
                column++;
            }
        }
//        С последнего столбца пойдём влево, до главной диагонали
        for (int i = lastColumnIndex; i >= 0 ; i--) {
            int row = 0;
            int column = i;
            int controlNumber = matrix[row][column];
            while (row <= lastRowIndex && column <= lastColumnIndex) {
                if (matrix[row][column] != controlNumber) {
                    return false;
                }
                row++;
                column++;
            }
        }
        return true;
    }
}
