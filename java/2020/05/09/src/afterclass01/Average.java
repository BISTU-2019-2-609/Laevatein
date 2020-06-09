package afterclass01;

/**
 * 一个求平均数的程序
 * @author Laevatein
 */
public class Average {
    public static int NUMBER_OF_AVERAGE = 6;
    /**
     * 求平均数的实体代码，可以通过修改上面的 {@code NUMBER_OF_AVERAGE} 调整传入数据的个数
     * @param array 包含6个double的数组
     * @return 计算好的平均数
     */
    public static double average(double[] array) {
        int sum = 0;
        for (int i = 0; i < NUMBER_OF_AVERAGE; i++) {
            sum += array[i];
        }
        return sum / NUMBER_OF_AVERAGE;
    }
}