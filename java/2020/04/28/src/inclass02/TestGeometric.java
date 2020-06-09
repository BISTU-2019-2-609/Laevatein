package inclass02;

import io.Input;

/**
 * 本题的测试类
 * @author Laevatein
 */
public class TestGeometric {
    static Input inputer = new Input();
    /**
     * 打印对应几何体的信息
     * @param gb
     */
    static private void display(GeometricObject gb) {
        System.out.println("Color: " + gb.getColor());
        System.out.println("Filled: " + gb.getFilled());
        System.out.println("Area: " + gb.getArea());
        System.out.println("Perimeter: " + gb.getPerimeter());
    }

    /**
     * 定义一个合规的三角形
     * @return 一个三角形
     */
    static private GeometricObject newTriangle() {
        double side1, side2, side3;
        while (true) {
            side1 = inputer.getInt("请输入第一条边边长：");
            side2 = inputer.getInt("请输入第二条边边长：");
            side3 = inputer.getInt("请输入第三条边边长：");
            if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
                return new Triangle(side1, side2, side3);
            } else {
                System.out.println("您输入的三边不能构成三角形，请重新输入！");
            }
        }
    }

    /**
     * 获取几何体是否有填充
     * @return 输入0返回false，输入1返回true，输入其他需重新输入
     */
    static private boolean isFilled() {
        int filled = inputer.getInt(0, 1, "请选择几何体是否有颜色填充（0为不填充，1为填充）：");
        if (filled == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println("请输入三角形三边长：");
        GeometricObject tr1 = newTriangle();
        tr1.setFilled(isFilled());
        tr1.setColor(inputer.getLine("请输入三角形颜色："));
        display(tr1);
        GeometricObject rec1 = new Rectangle(inputer.getDouble("请输入矩形宽："), inputer.getDouble("请输入矩形高："));
        rec1.setFilled(isFilled());
        rec1.setColor(inputer.getLine("请输入矩形颜色："));
        display(rec1);
    }
}