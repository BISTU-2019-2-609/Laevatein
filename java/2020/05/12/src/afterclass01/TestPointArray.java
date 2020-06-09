package afterclass01;

import java.util.logging.Logger;

import io.Input;

/**
 * 测试PointArray类的功能
 * @author Laevatein
 */
public class TestPointArray {
    private static Logger logger = Logger.getLogger("TestPointArray");

    public static void main(String[] args) {
        Input inputer = new Input();
        int n = inputer.getInt("请输入点的个数：");
        double[][] pointArray = PointArray.getArray(n);
        double shortestDistance = PointArray.distance(pointArray[0], pointArray[1]);
        int p1 = 0, p2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double tempDistance = PointArray.distance(pointArray[i], pointArray[j]);
                if (tempDistance < shortestDistance) {
                    p1 = i;
                    p2 = j;
                    shortestDistance = tempDistance;
                }
            }
        }
        logger.info(String.format("最近的两个点是(%f, %f, %f)和(%f, %f, %f)，距离是 %f", pointArray[p1][0], pointArray[p1][1], pointArray[p1][2], pointArray[p2][0], pointArray[p2][1], pointArray[p2][2], shortestDistance));
        inputer.close();
    }
}