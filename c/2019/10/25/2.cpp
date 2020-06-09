#include<stdio.h>
int main(){
    int n;
    int a[10];
    int q,p,b=0;
    printf("请输入总人数：\n");
    scanf("%d",&n);
    printf("请依次输入各同学的分数（以空格分隔）:\n");
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    printf("请输入查找的区间：\n");
    scanf("%d,%d",&q,&p);
    for(int i=0;i<n;i++){
        if(a[i]>=q&&a[i]<=p){
            b++;
        }
    }
    printf("在区间里的学生共 %d 名",b);
}