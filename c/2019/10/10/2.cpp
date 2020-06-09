#include<stdio.h>
int main(){
    int a[3];
    int max(int b[3]);
    int n=0;
    printf("这个程序会输出五个数字中的最大值\n");
    printf("请输入三个数字:（以空格分隔）\n");
    scanf("%d %d %d",&a[0],&a[1],&a[2]);
    int d;
    d=max(a);
    printf("这五个数中的最大值为 %d\n",d);
}

int max(int b[3]){
    int m=0,q=0;
    while (m<3)
    {
        if (b[m]>q)
        {
            q=b[m];
        }
        m++;
    }
    return q;
}