package inClass01;

class Point{

    private double x,y;

    public Point(){

    }

    public Point(double x, double y){
        this.x=x;
        this.y=y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}

class Circle{

    private Point o = new Point(Math.random()*10,Math.random()*8);
    private double r = Math.random()*12;

    public Circle(){

    }

    public Circle(Point o,double r){
        this.o=o;
        this.r=r;
    }

    public Point getO() {
        return o;
    }

    public void setO(Point o) {
        this.o = o;
    }

    public boolean contains(Point p){
        double d;
        d=Math.sqrt(Math.pow(this.o.getX()-p.getX(), 2)+Math.pow(this.o.getY()-p.getY(), 2));
        if(d<=this.r){
            return true;
        } else {
            return false;
        }
    }

    public double getArea(){
        return this.r*this.r*Math.PI;
    }

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
        p.setX(Math.random()*4);
        p.setY(Math.random()*9);
        if(c2.contains(p)){
            System.out.printf("点P(%f,%f)在圆c2内\n",p.getX(),p.getY());
        } else {
            System.out.printf("点P(%f,%f)不在圆c2内\n",p.getX(),p.getY());
        }
        System.out.printf("圆c2的面积为%f，周长为%f\n",c2.getArea(),c2.getPerimeter());
    }
}