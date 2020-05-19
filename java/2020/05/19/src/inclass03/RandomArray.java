package inclass03;

/**
 * 生成有一百个随机数组成的数组，并提供获取其中一个数据的方法
 * @author Laevatein
 */
public class RandomArray {
    private double[] randomArray = new double[100];

    public RandomArray() {
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = Math.random();
        }
    }

    public double getValue(int index) {
        return randomArray[index];
    }
}