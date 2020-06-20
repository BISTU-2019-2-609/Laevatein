package kdc2;

public class Mango extends Fruit {
    private String breed = "腰芒";

    public Mango(String breed, int unitPrice, int amount, double discount) {
        this.unitPrice = unitPrice;
        this.amount = amount;
        this.discount = discount;
        this.breed = breed;
    }

    public Mango(int unitPrice, int amount, double discount) {
        this.unitPrice = unitPrice;
        this.amount = amount;
        this.discount = discount;
    }

    @Override
    public void display() {
        String cherryString = "芒果: \n";
        cherryString += String.format("\t品种: %s\n", this.breed);
        cherryString += String.format("\t单价: %d\n", this.unitPrice);
        cherryString += String.format("\t折扣：%f\n", this.discount);
        cherryString += String.format("\t重量: %d\n", this.amount);
        System.out.print(cherryString);
    }

    @Override
    public double count(int unitPrice, int amount, double discount) {
        return unitPrice * amount * discount;
    }
}