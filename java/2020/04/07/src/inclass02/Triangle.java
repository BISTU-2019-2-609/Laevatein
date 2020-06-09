package inclass02;

/**
 * @author Laevatein
 */
public class Triangle extends GeometricObject {
    private double side1, side2, side3;

    public Triangle(){

    }

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled){
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea(){
        double p = (side1+side2+side3)/2;
        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }

    public double getPerimeter(){
        return side1+side2+side3;
    }

    public String toString(){
        return String.format("\tSide1: %f\n\tSide2: %f\n\tSide3: %f\n%s", side1, side2, side3, super.toString());
    }
}