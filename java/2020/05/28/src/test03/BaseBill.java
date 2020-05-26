package test03;

/**
 * 账单的基础类
 * @author Laevatein
 */
public abstract class BaseBill {
    protected double volumn;

    /**
     * 计算账单金额
     * @return 账单金额
     */
    public abstract double getBill(); 
}