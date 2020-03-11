#include<stdio.h>
int main(){
    double pi=2;
    double n=1;
    while (n<10000000)
    {
        pi=pi*(((2*n)*(2*n))/((2*n-1)*(2*n+1)));
        n++;
    }
    printf("pi= %f",pi);
}