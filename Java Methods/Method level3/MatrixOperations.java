import java.util.Random;

public class MatrixOperations {

    // Method to generate a random matrix
    public static double[][] generateMatrix(int rows, int cols) {
        Random rand = new Random();
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10); // range: 0-9
        return matrix;
    }

    // Method to add matrices
    public static double[][] addMatrix(double[][] a, double[][] b) {
        int rows = a.length, cols = a[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = a[i][j] + b[i][j];
        return result;
    }

    // Method to subtract matrices
    public static double[][] subtractMatrix(double[][] a, double[][] b) {
        int rows = a.length, cols = a[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = a[i][j] - b[i][j];
        return result;
    }

    // Method to multiply matrices
    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        int rows = a.length, cols = b[0].length, common = a[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                for (int k = 0; k < common; k++)
                    result[i][j] += a[i][k] * b[k][j];
        return result;
    }

    // Method to transpose a matrix
    public static double[][] transposeMatrix(double[][] a) {
        int rows = a.length, cols = a[0].length;
        double[][] result = new double[cols][rows];
        for (int i = 0; i < cols; i++)
            for (int j = 0; j < rows; j++)
                result[i][j] = a[j][i];
        return result;
    }

    // Determinant of 2x2 matrix
    public static double determinant2x2(double[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    // Determinant of 3x3 matrix
    public static double determinant3x3(double[][] m) {
        return m[0][0] * (m[1][1]*m[2][2] - m[1][2]*m[2][1])
             - m[0][1] * (m[1][0]*m[2][2] - m[1][2]*m[2][0])
             + m[0][2] * (m[1][0]*m[2][1] - m[1][1]*m[2][0]);
    }

    // Inverse of 2x2 matrix
    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        if (det == 0) return null;
        double[][] inv = {
            { m[1][1] / det, -m[0][1] / det },
            { -m[1][0] / det, m[0][0] / det }
        };
        return inv;
    }

    // Inverse of 3x3 matrix using adjoint/determinant
    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if (det == 0) return null;

        double[][] inv = new double[3][3];

        // Cofactor matrix
        inv[0][0] = (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / det;
        inv[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]) / det;
        inv[0][2] = (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / det;

        inv[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]) / det;
        inv[1][1] = (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / det;
        inv[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]) / det;

        inv[2][0] = (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / det;
        inv[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]) / det;
        inv[2][2] = (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / det;

        return transposeMatrix(inv); // adjoint
    }

    // Method to display matrix
    public static void displayMatrix(double[][] m) {
        for (double[] row : m) {
            for (double val : row) {
                System.out.printf("%8.2f", val);
            }
            System.out.println();
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        double[][] A = generateMatrix(3, 3);
        double[][] B = generateMatrix(3, 3);

        System.out.println("Matrix A:");
        displayMatrix(A);

        System.out.println("Matrix B:");
        displayMatrix(B);

        System.out.println("Addition (A + B):");
        displayMatrix(addMatrix(A, B));

        System.out.println("Subtraction (A - B):");
        displayMatrix(subtractMatrix(A, B));

        System.out.println("Multiplication (A * B):");
        displayMatrix(multiplyMatrix(A, B));

        System.out.println("Transpose of A:");
        displayMatrix(transposeMatrix(A));

        System.out.println("Determinant of A: " + determinant3x3(A));

        System.out.println("Inverse of A:");
        double[][] invA = inverse3x3(A);
        if (invA != null) displayMatrix(invA);
        else System.out.println("Matrix A is not invertible.");
    }
}
