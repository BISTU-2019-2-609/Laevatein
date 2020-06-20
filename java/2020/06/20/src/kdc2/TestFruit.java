package kdc2;

public class TestFruit {
    public static void main(String[] args) {
        //购买三种打折水果
        Fruit[] fruits={new Cherry("江苏",15,2,0.8),new Mango(12,2,0.95),new Cherry(28,3,0.7)};
 //输出水果信息
         System.out.println("----------------------------");
        for(int i = 0; i < fruits.length; i++)
          fruits[i].display();
         System.out.println("----------------------------");
         //输出水果的总价钱
         System.out.println("总价钱为：" + sum(fruits));		
         
     }
 
    static double sum(Fruit[] fruits){
        double sum = 0;
        for (int i = 0; i < fruits.length; i++) {
            sum += fruits[i].count(fruits[i].unitPrice, fruits[i].amount, fruits[i].discount);
        }
        return sum;
    }
 
}