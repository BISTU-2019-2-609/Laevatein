package inclass03;

import java.util.logging.Logger;

/**
 * 用来测试Triangle类和IllgalTriangleException异常
 * @author Leavatein
 */
public class TestTriangle {
    private static Logger logger = Logger.getLogger("Triangle");
    public static void main(String[] args) {
        try {
            @SuppressWarnings("unused")
            Triangle triangle1 = new Triangle(4, 5, 6);
            logger.info("triangle1构造成功");
        } catch (IllegalTriangleException exception) {
            logger.severe("triangle1三角形不合规！");
        }
        try {
            @SuppressWarnings("unused")
            Triangle triangle2 = new Triangle(1, 2, 3);
            logger.info("triangle1构造成功");
        } catch (IllegalTriangleException exception) {
            logger.severe("triangle2三角形不合规！");
        }
    }   
}