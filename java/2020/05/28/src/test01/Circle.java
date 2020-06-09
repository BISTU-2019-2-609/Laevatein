package test01;

/**
 * 描述一个圆
 * @author Laevatein
 */
public class Circle extends AbstractGeometricObject {

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

    @Override
    double getArea() {
        return PI * this.radius * this.radius;
    }

    @Override
    double getPerimeter() {
        return PI * 2 * this.radius;
    }
}