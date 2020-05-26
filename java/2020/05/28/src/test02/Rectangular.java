package test02;

/**
 * 描述一个矩形
 * @author Laevatein
 */
public class Rectangular extends GeometricObject {
    
    private double width, height;

    public Rectangular(double width, double height) {
        this.width = width;
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
     * 获取矩形面积
     * @return 面积
     */
    @Override
    public double getArea() {
        return this.height * this.width;
    }

    /**
     * 获取矩形周长
     * @return 周长
     */
    @Override
    public double getPerimeter() {
        return 2 *(width + height);
    }

    /**
     * 将对象属性格式化为字符串
     * @return 描述字符串
     */
    public String toString() {
        return String.format("矩形的宽：%f，矩形的高：%f，矩形的面积：%f", this.height, this.width, this.getArea());
    }
}