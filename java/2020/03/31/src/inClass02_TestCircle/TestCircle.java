package inClass02_TestCircle;

import inClass02_Circle.Circle;

public class TestCircle{
    public static void main(final String[] args) {
        Circle circle1 = new Circle();
        System.out.println("circle1的半径是：" + circle1.radius);
        System.out.println("circle1的面积是："+ circle1.getArea());
        Circle circle2 = new Circle(25);
        System.out.println("circle2的半径是：" + circle2.radius);
        System.out.println("circle2的面积是："+ circle2.getArea());
    }
}