package Finialclass;

import java.util.Scanner;

class Point{
    double px,py;

    public Point(){}

    void coordinateSet(double x,double y){
        this.px=x;
        this.py=y;
    }

    double getDistanceToBase(){
        return Math.sqrt(Math.pow(this.px,2)+Math.pow(this.py,2));
    }

    public static void main(String[] args) {
        Point p1 = new Point();
        p1.coordinateSet(Math.random()*10, Math.random()*15);
        System.out.println("已随机生成第一个点");
        Point p2 = new Point();
        Scanner getInput = new Scanner(System.in);
        double p2x,p2y;
        while(true){
            System.out.print("请输入第二个点的x坐标：");
            if(getInput.hasNextDouble()){
                p2x=getInput.nextDouble();
                break;
            } else {
                System.out.println("输入不合规，请重新输入！");
                getInput.next();
            }
        }
        while(true){
            System.out.print("请输入第二个点的y坐标：");
            if(getInput.hasNextDouble()){
                p2y=getInput.nextDouble();
                break;
            } else {
                System.out.println("输入不合规，请重新输入！");
                getInput.next();
            }
        }
        p2.coordinateSet(p2x, p2y);
        System.out.println(String.format("P1(%g,%g)到原点的距离为：%g",p1.px,p1.py,p1.getDistanceToBase()));
        System.out.println(String.format("P2(%g,%g)到原点的距离为：%g",p2.px,p2.py,p2.getDistanceToBase()));
        getInput.close();
    }
}

class Rectangle{
    double width,height;

    void lengthSet(double width,double height){
        this.width=width;
        this.height=height;
    }

    double getArea(){
        return this.height*this.width;
    }

    double getPerimeter(){
        return (this.height+this.width)*2;
    }

    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        double width,height;
        while(true){
            System.out.print("请输入矩形的宽：");
            if(getInput.hasNextDouble()){
                width=getInput.nextDouble();
                break;
            } else {
                System.out.println("输入不合规，请重新输入！");
                getInput.next();
            }
        }
        while(true){
            System.out.print("请输入矩形的高：");
            if(getInput.hasNextDouble()){
                height=getInput.nextDouble();
                break;
            } else {
                System.out.println("输入不合规，请重新输入！");
                getInput.next();
            }
        }
        Rectangle rec1 = new Rectangle();
        rec1.lengthSet(width, height);
        System.out.println(String.format("这个矩形的面积是：%f",rec1.getArea()));
        System.out.println(String.format("这个矩形的周长是：%f",rec1.getPerimeter()));
        getInput.close();
    }
}