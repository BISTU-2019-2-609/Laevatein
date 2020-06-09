package inClass02;

import java.util.Scanner;

class Circle {
    
    double classRadius = 1.0;

    double area(){
        return classRadius*classRadius*3.14;
    }

    void setRadius(double radius){
        classRadius = radius;
    }

    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        System.out.print("请输入第一个圆的半径：");
        Circle c1 = new Circle();
        c1.setRadius(getInput.nextDouble());
        System.out.print("请输入第二个圆的半径：");
        Circle c2 = new Circle();
        c2.setRadius(getInput.nextDouble());
        getInput.close();
        System.out.println("第一个圆的面积是："+c1.area());
        System.out.println("第二个圆的面积是："+c2.area());
    }
}