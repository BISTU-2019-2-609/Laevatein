package kdc2;

public abstract class Fruit {
    protected int unitPrice;
    protected int amount;
    protected double discount = 1;
    public abstract double count(int unitPrice, int amount, double discount);
    public abstract void display();
}