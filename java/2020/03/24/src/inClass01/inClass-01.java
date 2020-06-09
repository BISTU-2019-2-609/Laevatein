package inClass01;

//点类
class Point{
    private double x,y; //点坐标值

    //不设置初始坐标定义一个点
    public Point(){
        this.x=Math.random()*10;
        this.y=Math.random()*15;
    }

    //定义给定坐标的点
    public Point(double x, double y){
        this.x=x;
        this.y=y;
    }

    //获取点的x坐标
    public double getX() {
        return this.x;
    }

    //获取点的y坐标
    public double getY() {
        return this.y;
    }

    //设置点的x坐标
    public void setX(double x) {
        this.x = x;
    }

    //设置点的y坐标
    public void setY(double y) {
        this.y = y;
    }
}

//圆类
class Circle{
    private Point o; //圆心
    private double r;//半径

    //不给定圆心和半径定义圆
    public Circle(){
        this.o = new Point();
        r=Math.random()*15;
    }

    //定义给定圆心和半径的圆
    public Circle(Point o,double r){
        this.o=o;
        this.r=r;
    }

    //获取圆心
    public Point getO() {
        return o;
    }

    //设置圆心
    public void setO(Point o) {
        this.o = o;
    }

    //判定点p是否在圆内
    public boolean contains(Point p){
        double d;
        d=Math.sqrt(Math.pow(this.o.getX()-p.getX(), 2)+Math.pow(this.o.getY()-p.getY(), 2));
        if(d<=this.r){
            return true;
        } else {
            return false;
        }
    }

    //获取圆的面积
    public double getArea(){
        return this.r*this.r*Math.PI;
    }

    //获取圆的周长
    public double getPerimeter(){
        return 2*this.r*Math.PI;
    }
}

class TestCircle{
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.printf("圆c1的圆心为(%f,%f)\n",c1.getO().getX(),c1.getO().getY());
        System.out.printf("圆c1的面积为%f，周长为%f\n",c1.getArea(),c1.getPerimeter());
        Circle c2 = new Circle();
        Point p = new Point();
        if(c2.contains(p)){
            System.out.printf("点P(%f,%f)在圆c2内\n",p.getX(),p.getY());
        } else {
            System.out.printf("点P(%f,%f)不在圆c2内\n",p.getX(),p.getY());
        }
        System.out.printf("圆c2的面积为%f，周长为%f\n",c2.getArea(),c2.getPerimeter());
    }
}