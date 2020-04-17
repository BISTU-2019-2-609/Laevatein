package test0602;

import test0601.MyPoint;

public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(Math.random(), Math.random());
        System.out.printf("P1 和 P2 的距离是：%f\n", MyPoint.distance(point1, point2));
        System.out.printf("P1 和 随机点1 的距离是：%f\n", point1.distance(new MyPoint(Math.random(), Math.random())));
        System.out.printf("P2 和 随机点2 的距离是：%f\n", point2.distance(Math.random(), Math.random()));
    }
}