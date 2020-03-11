#include<stdio.h>
int main(){
    int sum,term,n,a;
    printf("Please input a:\n");
    scanf("%d",&a);
    printf("Pleas intput n:\n");
    scanf("%d",&n);
    term=a;
    for(int i=1;i<=n;i++){
        if (i==1){
            printf("%d",term);
            sum=term;
        }
        else
        {
            term=term*10+a;
            sum=sum+term;
            printf("+%d",term);
        }
    }
    printf("=%d",sum);
}