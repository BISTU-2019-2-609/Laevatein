package test05;

public class Account {
    private int id = 0;
    private double balance = 0;

    public Account() {

    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    public void withDraw(double amount) {
        if (this.balance - amount >= 0) {
            this.balance = this.balance - amount;
            System.out.printf("%f 元取款成功\n", amount);
        } else {
            System.out.println("余额不足，提取失败");
        }
    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }
}