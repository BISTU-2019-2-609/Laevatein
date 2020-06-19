package demo;

/**
 * 表示一个矩形，并计算他的周长和面积
 * @author Laevatein
 */
public class Rectangular extends GeometricObject implements GeometricCalculate {
    private double width, height;

    /**
     * 有参构造器
     * @param width 宽度
     * @param height 高度
     */
    public Rectangular(double width, double height) {
        this.width = width;
        this.height = height;
        geometricInstances++;
    }

    /**
     * 重新设置 height
     * @param height 高度
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * 重新设置 width
     * @param width 宽度
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * 获取 height
     * @return 高度
     */
    public double getHeight() {
        return height;
    }

    /**
     * 获取 width
     * @return 宽度
     */
    public double getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public double getPerimeter() {
        return 2 *(this.height + this.width);
    }

    /**
     * 获取面积的静态方法
     * @param rectangular 一个 Rectangular 类型的对象
     * @return 面积
     */
    public static double getArea(Rectangular rectangular) {
        return rectangular.getArea();
    }

    /**
     * 获取周长的静态方法
     * @param rectangular 一个 Rectangular 类型的对象
     * @return 周长
     */
    public static double getPerimeter(Rectangular rectangular) {
        return rectangular.getPerimeter();
    }
}