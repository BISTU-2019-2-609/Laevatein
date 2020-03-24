package afterClass01;

import IO.Input;

//定义机车类
class Vehicle{
    private float speed; //机车速度

    //无参数构造机车对象
    public Vehicle(){

    }

    //构造机车对象同时定义初速度
    public Vehicle(float speed){
        this.speed=speed;
    }

    //获取机车速度
    public float getSpeed() {
        return this.speed;
    }

    //重新设置机车速度
    public void setSpeed(float speed) {
        this.speed = speed;
    }

    //使机车加速
    public double speedUp(float up){
        if(this.speed+up>240){
            return 240f;
        } else {
            return this.speed+up;
        }
    }

    //使机车减速
    public float speedDown(float down){
        if(this.speed-down<0){
            return 0f;
        } else {
            return this.speed-down;
        }
    }
}

class vehicleTest{
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Input inputer = new Input();
        vehicle.setSpeed(inputer.getFloat("请输入机车初速度："));
        System.out.printf("机车初始速度为：%f\n加速10后为：%f\n加速15后为：%f\n降速50后为：%f\n降速20后为：%f\n",vehicle.getSpeed(),vehicle.speedUp(10),vehicle.speedUp(15),vehicle.speedDown(50),vehicle.speedDown(20));
    }
}