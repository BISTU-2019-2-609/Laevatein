#include<stdio.h>
int main(){
    printf("本程序会将您输入的小写字母转化为大写字母\n");
    printf("请输入您要转化的字母：\n");
    char a;
    scanf("%c",&a);
    printf("这个字母的大写为：%c\n",a-32);
}