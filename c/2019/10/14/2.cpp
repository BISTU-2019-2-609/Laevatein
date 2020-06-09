#include<stdio.h>
int main(){
    int oldr,middr,youngr=1;
    for(int month=1;month<=1;month++){
        oldr=oldr+middr;
        middr=youngr;
        youngr=oldr;
    } 
    printf("兔子总数：%d",youngr+middr+oldr);
}