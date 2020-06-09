package test03;

/**
 * 水费账单
 * @author Laevatein
 */
public class WaterBill extends BaseBill {
    private double[] rate = new double[3];
    private final double LEVAL_1 = 180;
    private final double LEVAL_2 = 260;

    public WaterBill() {
        this.rate[0] = 5;
        this.rate[1] = 7;
        this.rate[2] = 9;
    }

    public WaterBill(double volumn) {
        this.rate[0] = 5;
        this.rate[1] = 7;
        this.rate[2] = 9;
        this.volumn = volumn;
    }

    @Override
    public double getBill() {
        if (this.volumn <= LEVAL_1) {
            return this.volumn * this.rate[0];
        } else if (this.volumn <= LEVAL_2) {
            double level2 = this.volumn - LEVAL_1;
            return 180 * this.rate[0] + level2 * this.rate[1];
        } else {
            double level3 = this.volumn - LEVAL_2;
            return 180 * this.rate[0] + 80 * this.rate[1] + level3 * this.rate[2];
        }
    }
}