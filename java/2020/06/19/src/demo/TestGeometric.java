package demo;

public class TestGeometric {
    private static Input inputer = new Input();
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Rectangular rectangular = new Rectangular(Math.random(), Math.random());
        Triangle triangle = new Triangle(inputer.getDouble("请输入第一条边的长度："), inputer.getDouble("请输入第二条边的长度："), inputer.getDouble("请输入第三条边的长度："));
        System.out.println("geometricInstances:" + GeometricObject.geometricInstances);
        System.out.println("Circle's area:" + circle.getArea() + ", Circle's Perimeter:" + circle.getPerimeter());
        System.out.println("Rectangular's area:" + rectangular.getArea() + ", Rectangular's Perimeter:" + rectangular.getPerimeter());
        System.out.println("Triangle's area:" + triangle.getArea() + ", Triangle's Perimeter:" + triangle.getPerimeter());
        rectangular.setHeight(inputer.getDouble("请输入高的长度："));
        rectangular.setWidth(inputer.getDouble("请输入宽的长度："));
        System.out.println("geometricInstances:" + GeometricObject.geometricInstances);
        System.out.println("Rectangular's area:" + rectangular.getArea() + ", Rectangular's Perimeter:" + rectangular.getPerimeter());
    }
}