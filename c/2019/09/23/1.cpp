#include<stdio.h>
float money,deposit;
int year,cycle;
float rate;
int main(){
    printf("这个程序将帮助您计算存款所得\n目前这个程序仅能以一年为单位进行计算\n");
    printf("请输入本金：");
    scanf("%f",&deposit);
    printf("请输入利率：");
    scanf("%f",&rate);
    printf("请输入存期：");
    scanf("%d",&cycle);
    money=deposit;
    while (year<cycle)
    {
        money=money*(1+(rate/100));
        year++;
        printf("第 %d 年结束时，您账户总额为 %f 元\n",year,money);
    }
    printf("经过 %d 年，您的的存款所得为 %f 元\n",year,money-deposit);
}