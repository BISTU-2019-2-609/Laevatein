#include<stdio.h>
int main(){
    float x,y;
    printf("这个程序会对您输入的两个数字进行四则运算\n")
    printf("请输入两个待运算的数字，以“,”分隔：\n");
    scanf("%f,%f",&x,&y);
    printf("这两个数字的和是：%g\n",x+y);
    printf("这两个数字的差是：%g\n",x-y);
    printf("这两个数字的积是：%g\n",x*y);
    printf("这两个数字的商是：%g\n",x/y);
}