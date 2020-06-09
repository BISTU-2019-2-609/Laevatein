package test02;

/**
 * 描述一个圆
 * @author Laevatein
 */
public class Circle extends GeometricObject {

    private final double PI = 3.14;
    
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * 计算圆的面积
     * @return 面积
     */
    @Override
    public double getArea() {
        return PI * this.radius * this.radius;
    }

    /**
     * 计算圆的周长
     * @return 周长
     */
    @Override
    public double getPerimeter() {
        return PI * 2 * this.radius;
    }

    /**
     * 将对象属性格式化为字符串
     * @return 描述字符串
     */
    public String toString() {
        return String.format("圆的半径：%f，圆的面积：%f", this.radius, this.getArea());
    }
}