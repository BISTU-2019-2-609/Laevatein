package afterclass01;

import io.Input;

/**
 * 有关点集的操作
 * @author Laevatein
 */
public class PointArray {
    private static final int DIMENSION = 3;

    /**
     * 返回一个有n个点的点集
     * @param n 点的个数
     * @return 点集
     */
    public static double[ ][ ] getArray(int n) {
        Input inputer = new Input();
        double[][] points = new double[n][DIMENSION];
        for (int i = 0; i < n; i++) {
            points[i][0] = inputer.getDouble("请输入第" + (i + 1) + "个点的x坐标：");
            points[i][1] = inputer.getDouble("请输入第" + (i + 1) + "个点的y坐标：");
            points[i][2] = inputer.getDouble("请输入第" + (i + 1) + "个点的z坐标：");
        }
        inputer.close();
        return points;
    }

    /**
     * 返回两点间的距离
     * @param x1
     * @param y1
     * @param z1
     * @param x2
     * @param y2
     * @param z2
     * @return 距离
     */
    public static double distance(double x1, double y1, double z1, double x2, double y2, double z2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2) + Math.pow(z1 - z2, 2));
    }

    public static double distance(double[] p1, double[] p2) {
        double x1 = p1[0];
        double x2 = p2[0];
        double y1 = p1[1];
        double y2 = p2[1];
        double z1 = p1[2];
        double z2 = p2[2];
        return distance(x1, y1, z1, x2, y2, z2);
    }
}