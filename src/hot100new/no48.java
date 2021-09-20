package hot100new;

public class no48 {
    public void rotate(int[][] matrix) {
        int length = matrix.length;
        int[][] matrix_new = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                matrix_new[j][length-i-1] = matrix[i][j];
            }
        }

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                matrix[i][j] = matrix_new[i][j];
            }
        }
    }
}
