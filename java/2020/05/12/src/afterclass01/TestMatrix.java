package afterclass01;

/**
 * 用于测试Matrix功能的类
 * @author Laevatein
 */
public class TestMatrix {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix();
        matrix1.setNumbers(0, 0, 1);
        matrix1.setNumbers(0, 1, 2);
        matrix1.setNumbers(0, 2, 3);
        matrix1.setNumbers(1, 0, 4);
        matrix1.setNumbers(1, 1, 5);
        matrix1.setNumbers(1, 2, 6);
        matrix1.setNumbers(2, 0, 7);
        matrix1.setNumbers(2, 1, 8);
        matrix1.setNumbers(2, 2, 9);
        Matrix matrix2 = new Matrix();
        matrix2.setNumbers(0, 0, 0);
        matrix2.setNumbers(0, 1, 2);
        matrix2.setNumbers(0, 2, 4);
        matrix2.setNumbers(1, 0, 1);
        matrix2.setNumbers(1, 1, 4.5);
        matrix2.setNumbers(1, 2, 2.2);
        matrix2.setNumbers(2, 0, 1.1);
        matrix2.setNumbers(2, 1, 4.3);
        matrix2.setNumbers(2, 2, 5.2);
        Matrix matrix3 = new Matrix(Matrix.addMatrix(matrix1.getMatrix(), matrix2.getMatrix()));
        matrix3.printMatrix();
    }
}