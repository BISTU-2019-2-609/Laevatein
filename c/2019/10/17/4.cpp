#include<stdio.h>
int main(){
    int n,x;
    printf("Please input x:\n");
    scanf("%d",&x);
    printf("Please input n:\n");
    scanf("%d",&n);
    float factorial(int n);
    float power(float x,int n);
    float sum=1;
    for(int i=1;i<=n;i++){
        sum=sum+(power(x,i)/factorial(i));
    }
    printf("e^x = %f",sum);
}

float factorial(int n){
    int c=1;
    for(int b=1;b<=n;b++){
        c=c*b;
    }
    return (float) c;
}

float power(float x,int n){
    int c=1;
    for(int i=1;i<=n;i++){
        c=c*x;
    }
    return (float) c;
}