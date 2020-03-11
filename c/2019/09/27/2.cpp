#include<stdio.h>
int main(){
    int a[5];
    int max(int b[5]);
    int n=0;
    printf("这个程序会输出五个数字中的最大值\n");
    while (n<5)
    {
        printf("请输入第%d个数字:\n",n+1);
        scanf("%d",&a[n]);
        n++;
    }
    int d;
    d=max(a);
    printf("这五个数中的最大值为 %d\n",d);
}

int max(int b[5]){
    int m=0,q=0;
    while (m<5)
    {
        if (b[m]>q)
        {
            q=b[m];
        }
        m++;
    }
    return q;
}