#include<stdio.h>
int main(){
    printf("这个程序会把 yyyy-mm-dd 的日期格式转换为 yyyy/mm/dd 的格式\n");
    printf("请以 yyyy-mm-dd 的格式输入一个日期：\n");
    int yyyy,mm,dd;
    scanf("%d-%d-%d",&yyyy,&mm,&dd);
    printf("这个日期的 yyyy/mm/dd 格式为：\n");
    printf("%d/%d/%d\n",yyyy,mm,dd);
}