#include<stdio.h>
int main(){
    printf("please input 2 datas:");
    int a,b;
    scanf("%d,%d",&a,&b);
    printf("output:");
    for(int i=a;i<=b;i++){
        if((i%4==0 && i%100!=0) || (i%400==0 && i%4000!=0)){
           printf("%d\n",i);
        }
    }
}