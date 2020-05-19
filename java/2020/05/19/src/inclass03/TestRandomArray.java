package inclass03;

import java.util.logging.Logger;

import io.Input;

/**
 * 测试RandomArry类
 * @author Laevatein
 */
public class TestRandomArray {
    private static Input inputer = new Input();
    private static Logger logger = Logger.getLogger("randomArray");
    public static void main(String[] args) {
        RandomArray randomArray1 = new RandomArray();
        try {
            int index = inputer.getInt("请输入您要获取的序号（由0开始）：");
            logger.info(String.format("第%d个数为 %f", index, randomArray1.getValue(index)));
        } catch (IndexOutOfBoundsException exception) {
            logger.severe("Out of Bounds");
        }
        inputer.close();
    }
}