package IO;

import java.util.Scanner;

//获取输入
public class Input {
    //获取任意整数
    public int getInt(String notice){
        Scanner inputer = new Scanner(System.in);
        while(true){
            System.out.print(notice);
            if(inputer.hasNextInt()){
                int inputed;
                inputed = inputer.nextInt();
                inputer.close();
                return inputed;
            } else {
                System.out.println("输入不合规，请重新输入！");
                inputer.next();
            }
        }
    }

    //获取有范围的整数
    public int getInt(int min,int max,String notice){
        int inputed;
        min=Integer.MIN_VALUE;
        max=Integer.MAX_VALUE;
        Input inputer = new Input();
        while(true){
            inputed=inputer.getInt(notice);
            if(inputed>=min&&inputed<=max){
                return inputed;
            } else {
                System.out.println("输入不合规，请重新输入！"); 
            }
        }
    }

    //获取任意小数
    public float getFloat(String notice){
        Scanner inputer = new Scanner(System.in);
        while(true){
            System.out.print(notice);
            if(inputer.hasNextFloat()){
                float inputed;
                inputed = inputer.nextFloat();
                inputer.close();
                return inputed;
            } else {
                System.out.println("输入不合规，请重新输入！");
                inputer.next();
            }
        }
    }

    //获取有范围的小数
    public float getFloat(float min,float max,String notice){
        float inputed;
        min=Float.MIN_NORMAL;
        max=Float.MAX_VALUE;
        Input inputer = new Input();
        while(true){
            inputed=inputer.getFloat(notice);
            if(inputed>=min&&inputed<=max){
                return inputed;
            } else {
                System.out.println("输入不合规，请重新输入！"); 
            }
        }
    }

    //获取任意双精度浮点数
    public double getDouble(String notice){
        Scanner inputer = new Scanner(System.in);
        while(true){
            System.out.print(notice);
            if(inputer.hasNextDouble()){
                double inputed;
                inputed = inputer.nextDouble();
                inputer.close();
                return inputed;
            } else {
                System.out.println("输入不合规，请重新输入！");
                inputer.next();
            }
        }
    }

    //获取有范围的双精度浮点数
    public double getDouble(double min,double max,String notice){
        double inputed;
        min=Double.MIN_VALUE;
        max=Double.MAX_VALUE;
        Input inputer = new Input();
        while(true){
            inputed=inputer.getDouble(notice);
            if(inputed>=min&&inputed<=max){
                return inputed;
            } else {
                System.out.println("输入不合规，请重新输入！"); 
            }
        }
    }
}