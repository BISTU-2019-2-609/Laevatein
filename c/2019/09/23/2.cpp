#include<stdio.h>
#include<math.h>
int main(){
    printf("这个程序可以计算圆柱的体积和表面积\n");
    printf("请输入圆柱半径：");
    float r;
    scanf("%f",&r);
    printf("请输入圆柱高：");
    float h;
    scanf("%f",&h);
    float v,s,pi;
    pi=3.141592;
    v=((pow((double) r,(double) 2))*pi)*h;
    s=(2*r*pi)*h;
    printf("这个圆柱体的体积为 %.2f\n这个圆柱体的表面积为 %.2f\n",v,s);
}