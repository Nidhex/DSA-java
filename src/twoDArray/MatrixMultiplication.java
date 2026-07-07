package twoDArray;

public class MatrixMultiplication {

    public static void main(String[] args) {

        int[][] A = {
                {1,2},
                {3,4}
        };

        int[][] B = {
                {5,6},
                {7,8}
        };

        int rows = A.length;
        int cols = B[0].length;

        int[][] result = new int[rows][cols];

        // MATRIX MULTIPLICATION

        for(int i = 0; i < rows; i++) {

            for(int j = 0; j < cols; j++) {

                for(int k = 0; k < B.length; k++) {

                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // PRINT RESULT

        for(int i = 0; i < result.length; i++) {

            for(int j = 0; j < result[i].length; j++) {

                System.out.print(result[i][j] + " ");
            }

            System.out.println();
        }
    }
}