package challenge;

/**
 * @author Laevatein
 */
public class Point {
    private double x, y;

    /**
     * 构造默认点
     */
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    /**
     * 构造给定坐标的点
     * @param x 横坐标
     * @param y 纵坐标
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * 重新设置点横坐标
     * @param x 横坐标
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * 重新设置点纵坐标
     * @param y 纵坐标
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * 获取横坐标
     * @return 横坐标
     */
    public double getX() {
        return x;
    }

    /**
     * 获取纵坐标
     * @return 纵坐标
     */
    public double getY() {
        return y;
    }

    /**
     * 获取指定两点的距离
     * @param p1 第一个点
     * @param p2 第二个点
     * @return 两点的距离
     */
    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.x-p2.x, 2)+Math.pow(p1.y-p2.y, 2));
    }

    /**
     * 获取当前点和指定点的距离
     * @param p 指定点
     * @return 两点的距离
     */
    public double distance(Point p) {
        return distance(this, p);
    }
}