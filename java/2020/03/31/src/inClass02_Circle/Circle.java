package inClass02_Circle;

public class Circle{
    public double radius = 1.0;
    static int instanceNumber = 0;

    public Circle(){
        instanceNumber++;
    }

    public Circle(double newRadius){
        this.radius=newRadius;
        instanceNumber++;
    }

    public double getArea(){
        return radius*radius*3.14;
    }
}