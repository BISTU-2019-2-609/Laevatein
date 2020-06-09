package test01;

/**
 * 描述一个三角形
 * @author Laevatein
 */
public class Triangle extends AbstractGeometricObject {
    
    private double side1, side2, side3;

    /**
     * 构造一个三角形
     * @param side1 边长1
     * @param side2 边长2
     * @param side3 边长3
     */
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /**
     * @return the side1
     */
    public double getSide1() {
        return side1;
    }

    /**
     * @return the side2
     */
    public double getSide2() {
        return side2;
    }

    /**
     * @return the side3
     */
    public double getSide3() {
        return side3;
    }

    /**
     * @param side1 the side1 to set
     */
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    /**
     * @param side2 the side2 to set
     */
    public void setSide2(double side2) {
        this.side2 = side2;
    }

    /**
     * @param side3 the side3 to set
     */
    public void setSide3(double side3) {
        this.side3 = side3;
    }

    /**
     * 计算三角形的面积
     * @return 面积
     */
	@Override
	public double getArea() {
        double p = (this.side1 + this.side2 + this.side3)/ 2;
        return Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
	}

    /**
     * 计算三角形的周长
     * @return 周长
     */
	@Override
	public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
	}
}