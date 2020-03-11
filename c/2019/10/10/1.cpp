#include<stdio.h>
int main(){
    char w;
    printf("请输入一个字符：\n");
    scanf("%c",&w);
    if ((w>=65 && w<=90) || (w>=97 && w<=122))
    {
        printf("这个是字母\n");
    }
    else if ((w>=33 && w<=47) || (w>=58 && w<=64) || (w>=91 && w<=96) || (w>=123 && w<=126))
    {
        printf("这是个符号\n");
    }
    else if (w>=48 && w<=57)
    {
        printf("这是个数字\n");
    }
    else
    {
        printf("我也不知道您输入的什么\n");
    }
}