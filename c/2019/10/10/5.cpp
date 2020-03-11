#include<stdio.h>
int main(){
    int number;
    int n1=0,c;
    int divc(int a);
    printf("请输入一个数字：\n");
    scanf("%d",&number);
    while (true)
    {
        if (number/divc(n1)==0)
        {
            break;
        }
        else
        {
            n1++;
        }
    }
    printf("这个数字有 %d 位",n1);
}

int divc(int n){
    int times=0,c=1;
    while (times<n)
    {
        c=c*10;
        times++;
    }
    return c;
}