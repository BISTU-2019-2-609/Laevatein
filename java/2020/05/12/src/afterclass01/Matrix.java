package afterclass01;

/**
 * 定义矩阵的相关方法
 * @author Laevatein
 */
public class Matrix {
    public static int maxtrixSize = 3;

    private double[][] matrix;

    /**
     * 创建一个新的矩阵对象
     */
    public Matrix() {
        this.matrix = new double[maxtrixSize][maxtrixSize];
    }

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
    }

    /**
     * 设置矩阵内的数据
     * @param x 第一层数组的索引号
     * @param y 第二层数组的索引号
     * @param num 要设置的数据
     */
    public void setNumbers(int x, int y, double num) {
        this.matrix[x][y] = num;
    }

    /**
     * @return the matrix
     */
    public double[][] getMatrix() {
        return matrix;
    }

    /**
     * 两个矩阵的加法
     * @param a 矩阵a
     * @param b 矩阵b
     * @return 加和后的矩阵
     */
    public static double[ ][ ] addMatrix(double[ ][ ] a, double[ ][ ] b) {
        double[][] c = new double[maxtrixSize][maxtrixSize];
        for (int i = 0; i < maxtrixSize; i++) {
            for (int j = 0; j < maxtrixSize ; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    /**
     * 打印一个数组
     */
    public void printMatrix() {
        for (int i = 0; i < maxtrixSize; i++) {
            for (int j = 0; j < maxtrixSize; j++) {
                System.out.print(this.matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}