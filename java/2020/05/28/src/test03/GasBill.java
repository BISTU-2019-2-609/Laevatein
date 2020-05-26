package test03;

/**
 * 天然气账单
 * @author Laevatein
 */
public class GasBill extends BaseBill {
    private double rate;

    public GasBill() {
        this.rate = 2.28;
    };

    public GasBill(double volumn) {
        this.rate = 2.28;
        this.volumn = volumn;
    }

    @Override
    public double getBill() {
        return volumn * rate;
    }
}