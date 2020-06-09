#include<stdio.h>
int main(){
    int n=1;
    double sum;
    double factorial(int a);
    for(;n<=20;n++){
        sum=sum+factorial(n);
    }
    printf("%g",sum);
}

double factorial(int a){
    double c=1;
    for(double b=1;b<=a;b++){
        c=c*b;
    }
    return c;
}