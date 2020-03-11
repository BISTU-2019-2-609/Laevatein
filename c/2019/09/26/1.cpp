#include<stdio.h>
int main(){
    printf("这个程序会把十进制数转化为十六进制数\n");
    printf("请输入一个十进制数字：\n");
    int num;
    scanf("%d",&num);
    printf("%d 的十六进制表达为 0x%X\n",num,num);
}