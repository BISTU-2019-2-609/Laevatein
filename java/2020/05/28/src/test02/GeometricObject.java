package test02;

/**
 * 一个几何体的基本功能
 * @author Laevatein
 */
public class GeometricObject implements Comparable<GeometricObject> {
    
    /**
     * 计算几何体的面积
     * @return 面积
     */
    public double getArea() {
        return this.getArea();
    }
    
    /**
     * 计算几何体的周长
     * @return 周长
     */
    public double getPerimeter() {
        return this.getPerimeter();
    }

    /**
     * 比较两个GeometricObject的大小，以面积为依据
     * @param o 被比较的对象
     * @return 此对象大于被比较的对象时 1
     *         此对象等于被比较的对象时 0
     *         此对象小于被比较的对象时 -1
     */
    @Override
    public int compareTo(GeometricObject o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() == o.getArea()) {
            return 0;
        } else {
            return -1;
        }
    }
}