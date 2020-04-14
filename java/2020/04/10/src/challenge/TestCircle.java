package challenge;

/**
 * @author Laevatein
 */
public class TestCircle {
    public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.setRadius(6);
		System.out.println("点(7,8)在圆c1内吗？" + c1.contains(7,8));
		System.out.println("点(3,4)在圆c1内吗？" + c1.contains(3,4));
		
		Circle c2 = new Circle(new Point(7,3), 7);
		System.out.println("圆c2包含在圆c1吗？" + c1.contains(c2));
		System.out.println("圆c1与圆c2重叠吗？" + c1.overlaps(c2));
		
		Circle c3 = new Circle(new Point(90,100), 6);
		System.out.println("圆c1与圆c3重叠吗？" + c1.overlaps(c3));
		System.out.println("圆c3包含在圆c2吗？" + c2.contains(c3));
	}

}