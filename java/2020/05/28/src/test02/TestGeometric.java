package test02;

import java.util.Arrays;
import java.util.logging.Logger;

/**
 * 测试GeometricObject及其子类的功能
 * @author Laevatein
 */
public class TestGeometric {

    private static Logger logger = Logger.getLogger("TestGeometric");

    public static void main(String[] args) {
        Circle[] circles = new Circle[5];
        Rectangular[] rectangulars = new Rectangular[5];
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle(Math.random() * Math.random() * 100);
            logger.info(String.format("已生成第%d个圆：%s\n", i + 1, circles[i].toString()));
        }
        for (int i = 0; i < rectangulars.length; i++) {
            rectangulars[i] = new Rectangular(Math.random() * 100, Math.random() * Math.random() * 100);
            logger.info(String.format("已生成第%d个矩形：%s\n", i + 1, rectangulars[i].toString()));
        }
        Arrays.sort(circles);
        Arrays.sort(rectangulars);
        logger.info("排序完成!");
        for (int i = 0; i < circles.length; i++) {
            logger.info(String.format("第%d个圆：%s\n", i + 1, circles[i].toString()));
        }
        for (int i = 0; i < rectangulars.length; i++) {
            logger.info(String.format("第%d个矩形：%s\n", i + 1, rectangulars[i].toString()));
        }
    }
}