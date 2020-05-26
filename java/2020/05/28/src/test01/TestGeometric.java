package test01;

import java.util.logging.Logger;

/**
 * 测试AbstractGeometricObject及其子类的功能
 * @author Laevatein
 */
public class TestGeometric {

    private static Logger logger = Logger.getLogger("TestGeometric");
    
    /**
     * 计算一个数组里所有几何体的面积和
     * @param object 包含多个几何体的数组
     * @return 面积和
     */
    public static double totalArea(AbstractGeometricObject[] object) {
        double sum = 0;
        for (int i = 0; i < object.length; i++) {
            sum += object[i].getArea();
        }
        return sum;
    }

    /**
     * 计算一个数组里所有几何体的周长和
     * @param object 包含多个几何体的数组
     * @return 周长和
     */
    public static double totalPerimeter(AbstractGeometricObject[] object) {
        double sum = 0;
        for (int i = 0; i < object.length; i++) {
            sum += object[i].getPerimeter();
        }
        return sum;
    }

    public static void main(String[] args) {
        AbstractGeometricObject[] geometricObjects = new AbstractGeometricObject[3];
        geometricObjects[0] = new Rectangular(1, 2);
        geometricObjects[1] = new Triangle(3, 4, 5);
        geometricObjects[2] = new Circle(4);
        logger.info(String.format("这三个几何体的总面积为：%f", totalArea(geometricObjects)));
        logger.info(String.format("这三个几何体的总周长为：%f", totalPerimeter(geometricObjects)));
    }
}