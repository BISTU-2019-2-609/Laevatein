package kdc3;

public class Electrical implements Comparable<Electrical> {
    protected double price;
    protected double consumption;
    protected double length;
    protected double width;
    protected double height;
    protected static double num = 0;

    @SuppressWarnings("all")
    protected Electrical() {
        num++;
        System.out.println("创建了" + this.num + "个家用电器");
    }

    protected Electrical(double price, double length, double width, double height, double consumption) {
        this();
        this.price = price;
        this.consumption = consumption;
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public double CalculatVolume() {
        return this.length * this.width * this.height;
    }

    @Override
    public int compareTo(Electrical o) {
        if (this.CalculatVolume() > o.CalculatVolume()) {
            return 1;
        } else if (this.CalculatVolume() == o.CalculatVolume()) {
            return 0;
        } else {
            return -1;
        }
    }
}