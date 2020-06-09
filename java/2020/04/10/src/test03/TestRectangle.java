package test03;

import io.Input;

public class TestRectangle {
    public static void main(String[] args) {
        Input inputer = new Input();
        Rectangle rec1 = new Rectangle();
        rec1.setWidth(inputer.getDouble("请输入矩形1的宽："));
        rec1.setHeight(inputer.getDouble("请输入矩形1的高："));
        System.out.printf("宽为:%f 高为:%f 周长为:%f 面积为:%f 矩形个数为:%d\n", rec1.getWidth(), rec1.getHeight(), rec1.getPerimeter(), rec1.getArea(), Rectangle.getNumberOfRectangle());
        Rectangle rec2 = new Rectangle(inputer.getDouble("请输入矩形2的宽："), inputer.getDouble("请输入矩形1的高："));
        System.out.printf("宽为:%f 高为:%f 周长为:%f 面积为:%f 矩形个数为:%d\n", rec2.getWidth(), rec2.getHeight(), rec2.getPerimeter(), rec2.getArea(), Rectangle.getNumberOfRectangle());
        inputer.close();
    }
}