package inclass03;

/**
 * 表示一个三角形
 * @author Laevatein
 */
public class Triangle {

    public double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            throw new IllegalTriangleException();
        }
    }
}