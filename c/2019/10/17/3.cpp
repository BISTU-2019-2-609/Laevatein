#include<stdio.h>
int main(){
    int n=1;
    for (int a=1;a<=9;a++){
        for(int b=0;b<=9;b++){
            for(int c=0;c<=9;c++){
                if((a*a*a+b*b*b+c*c*c)==(a*100+b*10+c)){
                    printf("第 %d 个水仙花数是 %d\n",n,a*100+b*10+c);
                    n++;
                }
            }
        }
    }
}