#include<stdio.h>
int main(){
    int a;
    printf("程序中有存储一个数字，你可以尝试一下猜出这个数字\n");
    while (true)
    {
        printf("请输入您猜的数字：\n");
        scanf("%d",&a);
        if (a==12)
        {
            printf("您猜对了\n");
            break;
        }
        else
        {
            if (a<12)
            {
                printf("您猜的数字小了\n");
            }
            else
            {
                printf("您猜的数字大了\n");
            }   
        }
        
    }
}