package inclass01;

public class Investment {
    private double totalInvestment;
    private int year;
    private double annualInterestRate;
    public Investment(){
    }
    public Investment(double totalInvestment, int year, double annualInterestRate){
        this.totalInvestment = totalInvestment;
        this.year = year;
        this.annualInterestRate = annualInterestRate;
    }
    public double getTotalInvestment(){
        return totalInvestment;
    }
    public void setTotalInvestment(double totalInvestment){
        this.totalInvestment = totalInvestment;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    public double getFutureValue(){
        double monthlyInterestRate = annualInterestRate / 1200;
        return totalInvestment * Math.pow((1 + monthlyInterestRate), year * 12);
    }
}