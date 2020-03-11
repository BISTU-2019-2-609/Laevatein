package Finialclass;

import java.util.Scanner;

/*
**输入成绩，输出对应等级
*/

class Finialclass01 {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        int grade = 0;
        System.out.println("请输入学生成绩：");
        if(getInput.hasNextInt()){
            grade = getInput.nextInt();
        } else {
            System.out.println("输入不合规！");
            System.exit(1);
        }
        Finialclass01 finialclass01 = new Finialclass01();
        finialclass01.printGrade(grade);
        getInput.close();
    }

    void printGrade(int grade){
        char gradeLevel = 'E';
        if(grade>100){
            System.out.println("输入不合规！");
            System.exit(1);
        } else if(grade>=90){
            gradeLevel = 'A';
        } else if(grade>=80){
            gradeLevel = 'B';
        } else if(grade>=70){
            gradeLevel = 'C';
        } else if(grade>=60){
            gradeLevel = 'D';
        }
        System.out.println("成绩 "+grade+" 分对应为 "+gradeLevel+" 级");
    }
}