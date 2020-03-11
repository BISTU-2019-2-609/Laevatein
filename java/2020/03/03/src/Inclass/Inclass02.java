package Inclass;

import java.util.Scanner;

/*
** 输入五个数进行求和
*/

class Inclass0201 {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        int i=1,sum=0;
        while(i<=5){
            System.out.println("请输入第 "+i+" 个数：");
            sum=sum+getInput.nextInt();
            i=i+1;
        }
        System.out.println("您输入的五个数的和为："+sum);
        getInput.close();
    }
}

/*
**比较用户输入的两个数的大小
*/

class Inclass0202 {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        int a1=0,a2=0;
        double b1=0,b2=0;
        boolean ifDouble = false;
        System.out.println("请输入一个数字：");
        if(getInput.hasNextInt()){
            a1 = getInput.nextInt();
        } else if(getInput.hasNextDouble()){
            b1=getInput.nextDouble();
            ifDouble=true;
        } else {
            System.out.println("输入不合规！");
            System.exit(1);
        }
        if(ifDouble){
            System.out.println("请输入一个数字：");
            if(getInput.hasNextDouble()){
                b2=getInput.nextDouble();
            } else if (getInput.hasNextInt()){
                b2=(double) getInput.nextInt();
            } else {
                System.out.println("输入不合规！");
                System.exit(1);
            }
        } else {
            System.out.println("请输入一个数字：");
            if(getInput.hasNextInt()){
                a2=getInput.nextInt();
            } else if(getInput.hasNextDouble()){
                b1=(double)a1;
                b2=getInput.nextDouble();
                ifDouble=true;
            } else {
                System.out.println("输入不合规！");
                System.exit(1);
            }
        }
        Inclass0202 inclass0302 = new Inclass0202();
        if(ifDouble){
            System.out.println("两个数中大的是："+inclass0302.max(b1, b2));
        } else {
            System.out.println("两个数中大的是："+inclass0302.max(a1, a2));
        }
        getInput.close();
    }

    double max(double a, double b){
        if(a>b){
            return a;
        } else {
            return b;
        }
    }

    int max(int a,int b){
        if(a>b){
            return a;
        } else {
            return b;
        }
    }
}