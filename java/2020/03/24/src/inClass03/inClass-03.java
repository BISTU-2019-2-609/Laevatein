package inClass03;

class Point{
    private double x,y; //点坐标值

    //不设置初始坐标定义一个点
    public Point(){
        this.x=Math.random()*10;
        this.y=Math.random()*15;
    }
    //定义给定坐标的点
    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }

    //移动点
    public Point movePoint(int dx,int dy){
        return new Point(this.x+dx,this.y+dy);
    }

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(Math.random()*5,Math.random()*7);
        Point p1d,p2d;
        p1d=p1.movePoint((int) Math.random()*9,(int) Math.random()*18);
        p2d=p2.movePoint((int) Math.random()*17,(int) Math.random()*22);
        System.out.printf("P1移动前的坐标为(%f,%f)，移动后为(%f,%f)\n",p1.x,p1.y,p1d.x,p1d.y);
        System.out.printf("P2移动前的坐标为(%f,%f)，移动后为(%f,%f)\n",p2.x,p2.y,p2d.x,p2d.y);
    }
}