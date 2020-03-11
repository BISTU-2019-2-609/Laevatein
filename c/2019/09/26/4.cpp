#include<stdio.h>
int main(){
    printf("这个程序会计算一个天数为几周\n");
    printf("请输入一个天数：\n");
    int days;
    scanf("%d",&days);
    printf("%d 天是 %d 周和 %d 天\n",days,days/7,days%7);
}