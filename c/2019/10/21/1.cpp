#include<stdio.h>
int main(){
    int grade[100];
    int n,nperson=0,tgrade;
    printf("请输入总人数：\n");
    scanf("%d",&n);
    if(n>100){
        printf("Error!\n");
    }
    else{
        printf("请输入所有人的成绩，以空格分隔：\n");
        for(int i=0;i<n;i++){
            scanf("%d",&grade[i]);
        }
        printf("请输入要查找的目标成绩：\n");
        scanf("%d",&tgrade);
        for(int i=0;i<n;i++){
            if(grade[i]==tgrade){
                nperson++;
            }
        }
        printf("成绩为 %d 的有 %d 人\n",tgrade,nperson);
    }
}