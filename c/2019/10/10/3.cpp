#include<stdio.h>
int main(){
    printf("输入一个百分制分数：\n");
    int mark;
    char G;
    scanf("%d",&mark);
    if (mark>=90)
    {
        G='A';
    }
    else if (mark>80 && mark<89)
    {
        G='B';
    }
    else if (mark>70 && mark<79)
    {
        G='C';
    }
    else if (mark>60 && mark<69)
    {
        G='D';
    }
    else if (mark<59)
    {
        G='E';
    }
    printf("该成绩的等级为 %c\n",G);
}