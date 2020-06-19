package demo;

/**
 * 表示一个圆形，并计算他的周长和面积
 * @author Laevatein
 */
public class Circle extends GeometricObject implements GeometricCalculate {
    private static final double PI = 3.14;

    private double radius;

    /**
     * 有参构造器
     * @param radius 半径
     */
    public Circle(double radius) {
        this.radius = radius;
        geometricInstances++;
    }

    /**
     * 重新设置 radius
     * @param radius 半径
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * 获取半径
     * @return 半径
     */
    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return PI * this.radius * this.radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * this.radius;
    }

    /**
     * 获取面积的静态方法
     * @param circle 一个 Circle 对象
     * @return 面积
     */
    public static double getArea(Circle circle) {
        return circle.getArea();
    }

    /**
     * 获取周长的静态方法
     * @param circle 一个 Cicle 对象
     * @return 周长
     */
    public static double getPerimeter(Circle circle) {
        return circle.getPerimeter();
    }
}