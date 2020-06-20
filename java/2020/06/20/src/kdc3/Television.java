package kdc3;

public class Television extends Electrical implements Equipment {
    public Television() {
        super();
    }

    public Television(double price, double length, double width, double height, double consumption) {
        super(price, length, width, height, consumption);
    }

    @Override
    public double calculateConsumption() {
        return this.consumption / this.CalculatVolume();
    }

    @Override
    public String toString() {
        return String.format("我是一个电冰箱，我的价格是%f元，我的体积是%f立方米，我的单位体积耗电量是%f瓦每小时/立方米", this.price, this.CalculatVolume(), this.calculateConsumption());
    }
}