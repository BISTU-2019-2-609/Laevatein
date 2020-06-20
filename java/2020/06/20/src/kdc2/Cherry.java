package kdc2;

public class Cherry extends Fruit {
    private String origin = "山东";

    public Cherry(String origin, int unitPrice, int amount, double discount) {
        this.unitPrice = unitPrice;
        this.amount = amount;
        this.discount = discount;
        this.origin = origin;
    }

    public Cherry(int unitPrice, int amount, double discount) {
        this.unitPrice = unitPrice;
        this.amount = amount;
        this.discount = discount;
    }

    @Override
    public void display() {
        String cherryString = "樱桃: \n";
        cherryString += String.format("\t产地: %s\n", this.origin);
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