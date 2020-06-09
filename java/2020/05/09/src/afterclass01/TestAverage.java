package afterclass01;

import java.util.logging.Logger;

import io.Input;

/**
 * 用来测试Average类的
 * @author Laevatein
 */
public class TestAverage {
    private static Input inputer = new Input();
    private static Logger logger = Logger.getLogger("average");
    public static void main(String[] args) {
        double[] nums = new double[Average.NUMBER_OF_AVERAGE];
        for (int i = 0; i < Average.NUMBER_OF_AVERAGE; i++) {
            nums[i] = inputer.getDouble(String.format("输入第%d个数：", i+1));
        }
        logger.info(String.format("这%d个数的平均值为：", Average.NUMBER_OF_AVERAGE) + Average.average(nums));
        inputer.close();
    }
}