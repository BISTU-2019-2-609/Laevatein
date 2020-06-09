#include<stdio.h>
int main(){
    printf("这个程序会把一个四位数的每一位相加\n");
    printf("请输入一个四位数：\n");
    int num,t,h,ten,one;
    scanf("%d",&num);
    t=num/1000;
    h=(num%1000)/100;
    ten=(num%100)/10;
    one=num%10;
    printf("这个四位数每一位的和是：%d\n",t+h+ten+one);
}