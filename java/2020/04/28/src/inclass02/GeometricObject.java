package inclass02;

/**
 * 几何图形的基类，拥有几何图形的基本参数
 * @author Laevatein
 */
public abstract class GeometricObject {
    private String color;
    private boolean filled;

    public GeometricObject() {
        this.color = "white";
        this.filled = false;
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @return is filled
     */
    public boolean getFilled() {
        return filled;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @param filled the filled to set
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * 计算该图形的面积
     * @return 几何图形的面积
     */
    abstract double getArea();

    /**
     * 计算该图形的周长
     * @return 几何图形的周长
     */
    abstract double getPerimeter();
}