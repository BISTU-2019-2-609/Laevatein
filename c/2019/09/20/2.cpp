#include<stdio.h>
int main(){
    int rabbit,chicken,feet,heads;
    printf("这个程序将协助您计算鸡兔同笼问题\n");
    printf("请输入总头数和脚数，用“,”分隔\n");
    scanf("%d,%d",&heads,&feet);
    rabbit=(feet-2*heads)/2;
    chicken=heads-rabbit;
    printf("鸡有%d只，兔子有%d只\n",chicken,rabbit);
}