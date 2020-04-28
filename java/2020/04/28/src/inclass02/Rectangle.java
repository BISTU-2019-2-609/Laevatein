package inclass02;

/**
 * 表示一个矩形
 * 继承自 GeometricObject
 * @author Laevatein
 */
public class Rectangle extends GeometricObject {
    private double width, height;

    public Rectangle() {
        this.width = 5.0;
        this.height = 4.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * 计算矩形面积
     * @return 矩形面积
     */
    @Override
    public double getArea() {
        return this.height * this.width;
    }

    /**
     * 计算矩形周长
     * @return 矩形周长
     */
    @Override
    public double getPerimeter() {
        return 2 *(this.height + this.width);
    }
}