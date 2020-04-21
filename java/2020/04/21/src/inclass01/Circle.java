package inclass01;

/**
 * 可以表示一个圆
 * @author Laevatein
 */
public class Circle {
    private Point o;
    private double radius;

    /**
     * 定义一个圆心在(0, 0)半径为1的圆
     */
    public Circle() {
        this.o = new Point();
        this.radius = 1;
    }

    /**
     * 定义一个以 {@code o} 为圆心，{@code radius} 为半径的圆
     * @param o
     * @param radius
     */
    public Circle(Point o, double radius) {
        this.o = o;
        this.radius = radius;
    }

    /**
     * 定义一个以({@code x}, {@code y})为圆心，{@code radius} 为半径的圆
     * @param x
     * @param y
     * @param radius
     */
    public Circle(double x, double y, double radius) {
        this.o = new Point(x, y);
        this.radius = radius;
    }

    /**
     * @param o the o to set
     */
    public void setO(Point o) {
        this.o = o;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * @return the o
     */
    public Point getO() {
        return o;
    }

    /**
     * @return the radius
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
     * 判断指定点是否在圆内
     * @param o 
     * @return 在圆内：true；不在圆内：false
     */
    public boolean contains(Point p) {
        double p2pdistance = this.o.distance(p);
        if (p2pdistance < radius) {
            return true;
        } else {
            return false;
        }
    }

     /**
     * 判断指定圆是否在圆内
     * @param circle 
     * @return 在圆内：true；不在圆内：false
     */
    public boolean contains(Circle circle) {
        double p2pdistance = this.o.distance(circle.o);
        if (p2pdistance < this.radius - circle.radius) {
            return true;
        } else {
            return false;
        }
    }

     /**
     * 判断指定圆是否与该圆有重叠
     * @param circle 
     * @return 有重叠：true；无重叠：false
     */
    public boolean overlaps(Circle circle) {
        double p2pdistance = this.o.distance(circle.o);
        if (p2pdistance < this.radius + circle.radius) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 获取关于 {@code this} 的信息
     * @return {@code this} 的格式化字符串
     */
    @Override
    public String toString() {
        return String.format("center: %s \nradis: %f", this.o.toString(), this.radius);
    }

    /**
     * 判断 {@code this} 和 {@code obj} 是否相等
     * @return 若{@code obj} 不是 {@code Circle} 类时，返回 {@code false}；若 {@code this} 和 {@code obj} 的圆心和半径均相等，则返回 {@code true}，否则返回 {@code false}
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            return (((Circle) obj).o.equals(this.o)) && this.radius == ((Circle) obj).radius;
        } else {
            return false;
        }
    }
}