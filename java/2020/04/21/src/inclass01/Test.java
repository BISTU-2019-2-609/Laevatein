package inclass01;

/**
 * 测试 Circle 类和 Point 类
 * @author Laevatein
 */
public class Test {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(1, 2);
        System.out.println("p1 与 p2 相等：" + p1.equals(p2));
        System.out.println("p1 与 p3 相等：" + p3.equals(p1));
        Circle c1 = new Circle(p1, 6);
        Circle c2 = new Circle(p1, 5);
        Circle c3 = new Circle(p1, 6);
        Circle c4 = new Circle();
        Circle c5 = new Circle(7, 3, 7);
        Circle c6 = new Circle(90, 100, 6);
        System.out.println("c1 与 c2 相等：" + c1.equals(c2));
        System.out.println("c1 与 c3 相等：" + c3.equals(c1));
        System.out.println("c1:\n" + c1.toString());
        System.out.println("c2:\n" + c2.toString());
        System.out.println("(7, 8) 在 c1 内：" + c1.contains(new Point(7, 8)));
        System.out.println("(3, 4) 在 c1 内：" + c1.contains(new Point(3, 4)));
        System.out.println("c4 包含在 c1 内：" + c4.contains(c1));
        System.out.println("c4 包含在 c6 内：" + c6.contains(c4));
        System.out.println("c4 与 c6 重叠：" + c6.overlaps(c4));
        System.out.println("c4 与 c5 重叠：" + c4.overlaps(c5));
    }
}