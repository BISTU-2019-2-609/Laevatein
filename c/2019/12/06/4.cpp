#include<stdio.h>
int main(){
    printf("Please input a num:");
    int num;
    int factor[10000];
    int pos=0,sum=0;
    scanf("%d",&num);
    printf("Output:\n");
    if(num<0){
        printf("Input error!");
    }
    else{
        for(int i=1;i<=num;i++){
            pos=0;
            sum=0;
            for(int j=1;j<i;j++){
                if(num%i==0){
                    factor[pos]=i;
                    pos++;
                }
                for(int k=0;k<=pos;k++){
                    sum=sum+factor[k];
                }
                if(sum==i){
                    printf("%d is a wanshu:",j);
                    for(int k=0;k<=pos;k++){
                        printf("%d,",factor[k]);
                    }
                    printf("\n");
                }
            }
        }
    }
}