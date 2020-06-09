package inclass02;

/**
 * @author Laevatein
 */
public class TestGeometricObject {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle(3, 4, 5, "red", false);
        Triangle triangle3 = new Triangle(5, 12, 13);
        triangle1.setSide1(6);
        triangle1.setSide2(8);
        triangle1.setSide3(10);
        triangle1.setColor("blue");
        triangle1.setFilled(true);
        System.out.printf("Triangle1:\n%s\n", triangle1.toString());
        System.out.printf("Triangle2:\n%s\n", triangle2.toString());
        System.out.printf("Triangle3:\n%s\n", triangle3.toString());
    }
}