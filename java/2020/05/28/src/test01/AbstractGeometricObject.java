package test01;

/**
 * 一个几何体的基本功能
 * @author Laevatein
 */
public abstract class AbstractGeometricObject {
    
    /**
     * 计算几何体的面积
     * @return 面积
     */
    abstract double getArea();
    
    /**
     * 计算几何体的周长
     * @return 周长
     */
    abstract double getPerimeter();
}