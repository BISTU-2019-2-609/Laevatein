package inclass01;

/**
 * 描述一个不在坐标系里的圆
 * @author Laevatein
 */
public class Circle {
    private final double PI = 3.14;
    private final double DOUBLE_PI = 2 * PI;
    
    private static int instanceNumber = 0;

    private double radius;

    public Circle() {
        instanceNumber++;
    }

    public Circle(double radius) {
        this.radius = radius;
        instanceNumber++;
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
     * @return the instanceNumber
     */
    public static int getInstanceNumber() {
        return instanceNumber;
    }

    public double getArea() {
        return DOUBLE_PI * radius;
    }
}