package test03;

/**
 * @author Laevatein
 */
public class Rectangle {
    static int numberOfRectangle = 0;
    private double width = 1, height = 1;

    public Rectangle() {
        numberOfRectangle++;
    }

    public Rectangle(double width, double height) {
        numberOfRectangle++;
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

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    static public int getNumberOfRectangle() {
        return numberOfRectangle;
    }
}