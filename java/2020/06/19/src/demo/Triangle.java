package demo;

/**
 * 表示一个三角形，并计算他的周长和面积
 * @author Laevatein
 */
public class Triangle extends GeometricObject implements GeometricCalculate {
    private double side1, side2, side3;

    /**
     * 有参构造器
     * @param side1 边1
     * @param side2 边2
     * @param side3 边3
     */
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        geometricInstances++;
    }

    /**
     * 获取 side1
     * @return 边1
     */
    public double getSide1() {
        return side1;
    }

    /**
     * 获取 side2
     * @return 边2
     */
    public double getSide2() {
        return side2;
    }

    /**
     * 获取 side3
     * @return 边3
     */
    public double getSide3() {
        return side3;
    }

    /**
     * 重新设置 side1
     * @param side1 边1
     */
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    /**
     * 重新设置 side2
     * @param side2 边3
     */
    public void setSide2(double side2) {
        this.side2 = side2;
    }

    /**
     * 重新设置 side3
     * @param side3 边3
     */
    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        double p = (this.side1 + this.side2 + this.side3)/ 2;
        return Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3)); 
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    /**
     * 获取面积的静态方法
     * @param triangle 一个 Triangle 类型的对象
     * @return 面积
     */
    public static double getArea(Triangle triangle) {
          return triangle.getArea();
    }

    /**
     * 获取周长的静态方法
     * @param triangle 一个 Triangle 类型的对象
     * @return 周长
     */
    public static double getPerimeter(Triangle triangle) {
        return triangle.getPerimeter();
    }
}