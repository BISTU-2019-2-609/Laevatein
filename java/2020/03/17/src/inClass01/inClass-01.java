package inClass01;

import java.util.Scanner;

class A {
    int add(int a,int b){
        return a+b;
    }

    int add(int a,int b,int c){
        return a+b+c;
    }

    double add(double d,double e){
        return d+e;
    }

    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        A operation =new A();
        int a=0,b=0,c=0,nums=2;
        double d=0.0,e=0.0;
        boolean ifDouble=false;
        while(true){
            System.out.print("请输入需要求和的数的个数（2-3）：");
            if(getInput.hasNextInt()){
                nums=getInput.nextInt();
                if(nums==2||nums==3){
                    break;
                } else {
                    System.out.println("输入不合规，请重新输入！");
                }
                
            } else {
                System.out.println("输入不合规，请重新输入！");
                getInput.next();
            }
        }
        while(true){
            System.out.print("请输入第一个运算数（若3个数求和则必须为整数）：");
            if(getInput.hasNextDouble()&&nums==2){
                d=getInput.nextDouble();
                ifDouble=true;
                break;
            } else if(getInput.hasNextInt()){
                a=getInput.nextInt();
                break;
            } else {
                System.out.println("输入不合规，请重新输入！");
                getInput.next();
            }
        }
        while(true){
            System.out.print("请输入第二个运算数（若3个数求和则必须为整数）：");
            if((getInput.hasNextDouble()&&nums==2) || ifDouble){
                e=getInput.nextDouble();
                if(!ifDouble){
                    d=(double)a;
                    ifDouble=true;
                }
                break;
            } else if(getInput.hasNextInt()){
                b=getInput.nextInt();
                break;
            } else {
                System.out.println("输入不合规，请重新输入！");
                getInput.next();
            }
        }
        if(ifDouble){
            System.out.println(d+" + "+e+" = "+operation.add(d, e));
        } else if (nums==2){
            System.out.println(a+" + "+b+" = "+operation.add(a, b));
        } else {
            while(true){
                System.out.print("请输入第三个运算数：");
                if(getInput.hasNextInt()){
                    c=getInput.nextInt();
                    break;
                } else {
                    System.out.println("输入不合规，请重新输入！");
                    getInput.next();
                }
            }
            System.out.println(a+" + "+b+" + "+c+" = "+operation.add(a, b,c));
        }
        getInput.close();
    }
}