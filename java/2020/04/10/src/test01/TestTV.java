package test01;

import java.util.Scanner;

/**
 * @author Laevatein
 */
public class TestTV {
    public static void main(String[] args) {
        TV tv1 = new TV();
        Scanner inputer = new Scanner(System.in);
        tv1.turnOn();
        System.out.println("请输入要设置的音量和频道：（以空格分隔）");
        tv1.setVolum(inputer.nextInt());
        tv1.setChannel(inputer.nextInt());
        System.out.printf("tv的频道和音量分别为：%d和%d\n", tv1.getChannel(), tv1.getVolum());
        tv1.channelUp();
        tv1.volumDown();
        System.out.printf("调整后的频道和音量分别为：%d和%d\n", tv1.getChannel(), tv1.getVolum());
        tv1.turnOff();
        inputer.close();
    }
}