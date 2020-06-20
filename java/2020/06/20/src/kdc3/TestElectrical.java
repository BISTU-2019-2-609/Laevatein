package kdc3;

import java.util.Arrays;

public class TestElectrical {
    public static void main(String[] args) {
        Electrical[] electricals = new Electrical[4];
        electricals[0] = new Refrigerator(3000, 1, 1, 1, 1000);
        electricals[1] = new Television(3000, 0.5, 1, 1, 2000);
        electricals[2] = new Refrigerator(5000, 2, 3, 5, 5000);
        electricals[3] = new Television(1000, 0.1, 0.2, 0.3, 10000);
        Arrays.sort(electricals);
        for (int i = 0; i < electricals.length; i++) {
            System.out.println(electricals[i]);
        }
    }
}