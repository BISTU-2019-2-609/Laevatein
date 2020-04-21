package inclass01;

/**
 * 可以表示一个点
 * @author Laevatein
 */
public class Point {
    private double x, y;

    /**
     * 定义(0, 0)点
     */
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    /**
     * 定义一个指定坐标的点
     * @param x
     * @param y
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * 计算两个指定点 {@code p1} 和 {@code p2} 的距离
     * @param p1
     * @param p2
     * @return {@code p1} 和 {@code p2} 距离
     */
    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.x-p2.x, 2)+Math.pow(p1.y-p2.y, 2));
    }

    /**
     * 计算 {@code this} 和指定点 {@code p} 的距离
     * @param p
     * @return {@code this} 和 {@code p} 距离
     */
    public double distance(Point p) {
        return distance(this, p);
    }

    /**
     * 获取关于 {@code this} 的信息
     * @return {@code this} 的格式化字符串
     */
    @Override
    public String toString() {
        return String.format("x: %f, y: %f", this.x, this.y);
    }

    /**
     * 判断 {@code this} 和 {@code obj} 是否相等
     * @return 若{@code obj} 不是 {@code Point} 类时，返回 {@code false}；若 {@code this} 和 {@code obj} 的横纵坐标均相等，则返回 {@code true}，否则返回 {@code false}
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            return (this.x == ((Point) obj).x) && (this.y == ((Point) obj).y);
        } else {
            return false;
        }
    }
}