package afterClass01;

import java.util.Scanner;

class Vehicle{
    private float speed;

    public Vehicle(){

    }

    public Vehicle(float speed){
        this.speed=speed;
    }

    public float getSpeed() {
        return this.speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public double speedUp(float up){
        if(this.speed+up>240){
            return 240f;
        } else {
            return this.speed+up;
        }
    }

    public float speedDown(float down){
        if(this.speed-down<0){
            return 0f;
        } else {
            return this.speed-down;
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Scanner getInput = new Scanner(System.in);
        while(true){
            System.out.print("请输入机车初始速度：");
            if(getInput.hasNextFloat()){
                vehicle.setSpeed(getInput.nextFloat());
                break;
            } else {
                System.out.println("输入不合规，请重新输入！");
                getInput.next();
            }
        }
        System.out.printf("机车初始速度为：%f\n加速10后为：%f\n加速15后为：%f\n降速50后为：%f\n降速20后为：%f\n",vehicle.getSpeed(),vehicle.speedUp(10),vehicle.speedUp(15),vehicle.speedDown(50),vehicle.speedDown(20));
        getInput.close();
    }
}