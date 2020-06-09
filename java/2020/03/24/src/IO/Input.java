package IO;

import java.util.Scanner;

//获取输入
public class Input {
    Scanner inputer;
    
    public Input(){
        this.inputer = new Scanner(System.in);
    }
    
    //获取任意整数
    public int getInt(String notice){
        while(true){
            System.out.print(notice);
            if(inputer.hasNextInt()){
                int inputed = inputer.nextInt();
                return inputed;
            } else {
                System.out.println("输入不合规，请重新输入！");
                inputer.next();
            }
        }
    }

    //获取有范围的整数
    public int getInt(int min,int max,String notice){
        while(true){
            int inputed = getInt(notice);
            if(inputed>=min&&inputed<=max){
                return inputed;
            } else {
                System.out.println("输入不合规，请重新输入！"); 
            }
        }
    }

    //获取任意小数
    public float getFloat(String notice){
        while(true){
            System.out.print(notice);
            if(inputer.hasNextFloat()){
                float inputed = inputer.nextFloat();
                return inputed;
            } else {
                System.out.println("输入不合规，请重新输入！");
                inputer.next();
            }
        }
    }

    //获取有范围的小数
    public float getFloat(float min,float max,String notice){
        while(true){
            float inputed = getFloat(notice);
            if(inputed>=min&&inputed<=max){
                return inputed;
            } else {
                System.out.println("输入不合规，请重新输入！"); 
            }
        }
    }

    //获取任意双精度浮点数
    public double getDouble(String notice){
        while(true){
            System.out.print(notice);
            if(inputer.hasNextDouble()){
                double inputed = inputer.nextDouble();
                return inputed;
            } else {
                System.out.println("输入不合规，请重新输入！");
                inputer.next();
            }
        }
    }

    //获取有范围的双精度浮点数
    public double getDouble(double min,double max,String notice){
        while(true){
            double inputed = getDouble(notice);
            if(inputed>=min&&inputed<=max){
                return inputed;
            } else {
                System.out.println("输入不合规，请重新输入！"); 
            }
        }
    }

    public void close(){
        this.inputer.close();
    }
}