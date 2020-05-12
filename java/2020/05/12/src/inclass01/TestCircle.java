package inclass01;

import java.util.logging.Logger;

import io.Input;

/**
 * 测试Circle类的功能
 * @author Laevatein
 */
public class TestCircle {
    private static Input inputer = new Input();
    private static Logger logger = Logger.getLogger("TestCircle");
    
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(inputer.getDouble("请输入第一个圆的半径："));
        circles[1] = new Circle(inputer.getDouble("请输入第二个圆的半径："));
        circles[2] = new Circle(inputer.getDouble("请输入第三个圆的半径："));
        logger.info("第一个圆的面积为：" + circles[0].getArea());
        logger.info("第二个圆的面积为：" + circles[1].getArea());
        logger.info("第三个圆的面积为：" + circles[2].getArea());
        inputer.close();
    }
}