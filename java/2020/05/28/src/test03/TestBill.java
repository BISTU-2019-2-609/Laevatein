package test03;

import java.util.logging.Logger;

/**
 * 测试BaseBill类及其子类的功能
 * @author Laevatein
 */
public class TestBill {
    
    private static Logger logger = Logger.getLogger("bill");

    public static void main(String[] args) {
        BaseBill bill1 = new GasBill(40);
        BaseBill bill2 = new WaterBill(30);
        BaseBill bill3 = new WaterBill(200);
        logger.info(String.format("第一笔账单金额为：%f", bill1.getBill()));
        logger.info(String.format("第二笔账单金额为：%f", bill2.getBill()));
        logger.info(String.format("第三笔账单金额为：%f", bill3.getBill()));
    }
}