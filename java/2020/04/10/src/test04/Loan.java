package test04;

import java.util.Date;

/**
 * @author Laevatein
 */
public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    Date loanDate;

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount, Date loanDate) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = loanDate;
    }

    public Loan() {
        this(18, 1, 10000, new Date());
    }

    /**
     * @param loanDate the loanDate to set
     */
    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    /**
     * @param annualInterestRate the annualInterestRate to set
     */
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    /**
     * @param loanAmount the loanAmount to set
     */
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    /**
     * @param numberOfYears the numberOfYears to set
     */
    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    /**
     * @return the loanDate
     */
    public Date getLoanDate() {
        return loanDate;
    }

    /**
     * @return the annualInterestRate
     */
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /**
     * @return the loanAmount
     */
    public double getLoanAmount() {
        return loanAmount;
    }
    
    /**
     * @return the numberOfYears
     */
    public int getNumberOfYears() {
        return numberOfYears;
    }

    public double getMonthlyPayment() {
        double mothlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * (mothlyInterestRate / (1 - Math.pow(1 / (1 + mothlyInterestRate), numberOfYears * 12)));
        return monthlyPayment;
    }

    public double getTotalPayment() {
        return this.getMonthlyPayment() * numberOfYears * 12;
    }
}