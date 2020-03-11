#include<stdio.h>
int main(){
    float hours;
    printf("输入每天工作小时数：\n");
    scanf("%f",&hours);
    float sa(int hours);
    float ta(float salary);
    if (hours<24)
    {
        float salary,tax,income;
        salary=sa(hours);
        tax=ta(salary);
        income=salary-tax;
        printf("薪水：%g\n 税 ：%g\n收入：%g\n",salary,tax,income);
    }
    else
    {
        printf("时间输入错误");
    }
    
}

float sa(int hours){
    float salary;
    if (hours<8)
    {
        salary=50*hours*21.5;
    }
    else
    {
        salary=(50*8*21.5)+(50*((hours-8)*1.5)*21.5);
    }
    return salary;
}

float ta(float salary){
    float tax;
    if (salary>800 && salary<5000)
    {
        tax=(salary-800)*0.2;
    }
    else if (salary>5000)
    {
        tax=((salary-5000)*0.3)+840;
    }
    else
    {
        tax=0;
    }
    return tax;
}