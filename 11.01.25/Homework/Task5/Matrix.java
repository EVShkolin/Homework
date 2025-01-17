import java.util.Arrays;

public class Matrix {
    private double[][] matrix = new double[2][2];

    public Matrix() {}

    public Matrix(double n) {
        for (double[] arr : matrix) {
            Arrays.fill(arr, n);
        }
    }

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
    }

    public Matrix add(Matrix m) {
        double[][] newMatrix = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                newMatrix[i][j] = matrix[i][j] + m.matrix[i][j];
            }
        }

        return new Matrix(newMatrix);
    }

    public void add2(Matrix m) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix[i][j] += m.matrix[i][j];
            }
        }
    }

    public Matrix sub(Matrix m) {
        double[][] newMatrix = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                newMatrix[i][j] = matrix[i][j] - m.matrix[i][j];
            }
        }
        return new Matrix(newMatrix);
    }

    public void sub2(Matrix m) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix[i][j] -= m.matrix[i][j];
            }
        }
    }

    public Matrix multNumber(double num) {
        double[][] newMatrix = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                newMatrix[i][j] = matrix[i][j] * num;
            }
        }
        return new Matrix(newMatrix);
    }

    public void multNum2(double num) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix[i][j] *= num;
            }
        }
    }

    public Matrix multMatrix(Matrix m) {
        double[][] newMatrix = new double[2][2];
        for (int k = 0; k < 2; k++) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    newMatrix[i][j] += m.matrix[i][k] * m.matrix[k][j];
                }
            }
        }
        return new Matrix(newMatrix);
    }

    public void multMatrix2(Matrix m) {
        double[][] newMatrix = new double[2][2];
        for (int k = 0; k < 2; k++) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    newMatrix[i][j] += matrix[i][k] * m.matrix[k][j];
                }
            }
        }
        matrix = newMatrix;
    }

}
