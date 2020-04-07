package inclass02;

/**
 * @author Leavatein
 */
public class Circle extends GeometricObject {
    private double radius;

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*3.14;
    }

    public double getPerimeter(){
        return 2*radius*3.14;
    }

    public String toString(){
        return String.format("\tRadius: %f\n%s", radius, super.toString());
    }
}