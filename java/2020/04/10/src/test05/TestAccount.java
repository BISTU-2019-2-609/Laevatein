package test05;

import io.Input;

/**
 * @author Laevatein
 */
public class TestAccount {
    public static void main(String[] args) {
        Input inputer = new Input();
        Account account1 = new Account(1, inputer.getDouble("请输入初始余额："));
        account1.withDraw(inputer.getDouble("请输入取款金额："));
        account1.deposit(inputer.getDouble("请输入存款金额："));
        System.out.printf("当前账户余额:%f\n", account1.getBalance());
        inputer.close();
    }
}