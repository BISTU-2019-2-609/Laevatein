package test04;

import java.util.Date;

import io.Input;

/**
 * @author Laevatein
 */
public class TestLoan {
    public static void main(String[] args) {
        Input inputer = new Input();
        Loan loan = new Loan(inputer.getDouble("请输入年利率："), inputer.getInt("请输入贷款年限："), inputer.getDouble("请输入贷款总额："), new Date());
        System.out.printf("贷款年利率是:%f\n", loan.getAnnualInterestRate());
        System.out.printf("贷款总额是:%f\n",loan. getLoanAmount());
        System.out.printf("贷款年限是:%d\n", loan.getNumberOfYears());
        System.out.printf("月还款额是:%f\n", loan.getMonthlyPayment());
        System.out.printf("还款总额是:%f", loan.getTotalPayment());
    }
}