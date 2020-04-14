package challenge;

/**
 * @author Laevatein
 */
public class Circle {
    private Point p;
    private double radius;

    /**
     * 构造默认圆
     */
    public Circle() {
        this.p = new Point();
        this.radius = 1;
    }

    /**
     * 提供圆心点和半径构造圆
     * @param p 圆心
     * @param radius 半径
     */
    public Circle(Point p, double radius) {
        this.p = p;
        this.radius = radius;
    }

    /**
     * 提供圆心坐标和半径构造圆
     * @param x 圆心横坐标
     * @param y 圆心纵坐标
     * @param radius 半径
     */
    public Circle(double x, double y, double radius) {
        this.p = new Point(x, y);
        this.radius = radius;
    }

    /**
     * 重新设置圆心
     * @param p 圆心点
     */
    public void setP(Point p) {
        this.p = p;
    }

    /**
     * 重新设置半径
     * @param radius 半径
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * 获取圆心点
     * @return 圆心点
     */
    public Point getP() {
        return p;
    }

    /**
     * 获取半径
     * @return 半径
     */
    public double getRadius() {
        return radius;
    }

    /**
     * 获取圆面积
     * @return 面积
     */
    public double getArea() {
        return radius*radius*3.14;
    }

    /**
     * 获取圆周长
     * @return 周长
     */
    public double getPerimeter() {
        return 2*3.14*radius;
    }

    /**
     * 判断给定坐标的点是否在圆内
     * @param x 点横坐标
     * @param y 点纵坐标
     * @return 在圆内：true；不在圆内：false
     */
    public boolean contains(double x, double y) {
        double p2pdistance = this.p.distance(new Point(x, y));
        if (p2pdistance < radius) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 判断指定点是否在圆内
     * @param p 点
     * @return 在圆内：true；不在圆内：false
     */
    public boolean contains(Point p) {
        double p2pdistance = this.p.distance(p);
        if (p2pdistance < radius) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 判断指定圆是否在圆内
     * @param circle 指定圆
     * @return 在圆内：true；不在圆内：false
     */
    public boolean contains(Circle circle) {
        double p2pdistance = this.p.distance(circle.p);
        if (p2pdistance < this.radius - circle.radius) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 判断指定圆是否与该圆有重叠
     * @param circle 指定圆
     * @return 有重叠：true；无重叠：false
     */
    public boolean overlaps(Circle circle) {
        double p2pdistance = this.p.distance(circle.p);
        if (p2pdistance < this.radius + circle.radius) {
            return true;
        } else {
            return false;
        }
    }
}