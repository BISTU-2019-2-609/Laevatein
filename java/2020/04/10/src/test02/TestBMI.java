package test02;

import io.Input;

/**
 * @author Laevatein
 */
public class TestBMI {
    public static void main(String[] args) {
        Input inputer = new Input();
        String name;
        int age;
        double weight, height;
        name = inputer.getLine("请输入姓名：");
        age = inputer.getInt("请输入年龄：");
        height = inputer.getDouble("请输入身高：");
        weight = inputer.getDouble("请输入体重：");
        BMI bmi = new BMI(name, age, weight, height);
        System.out.println("姓名：" + name);
        System.out.println("年龄" + age);
        System.out.println("体重指数：" + bmi.getBMI());
        System.out.println("体重状况：" + bmi.getStatus());
        inputer.close();
    }
}