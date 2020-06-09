#include<stdio.h>
int main(){
    int factorial(int);
    while (true){
        printf("Please input a number, this progamme will make a factorial for it.\n");
        printf("Your number i\s:");
        int num;
        scanf("%d",&num);
        if (num<0){
            printf("End of Progamme.\n");
            break;
        }
        printf("%d\'s factorial is %d.\n",num,factorial(num));
    }
}

int factorial(int n){
    int res=1;
    for(int i=1;i<=n;i++){
        res=res*i;
    }
    return res;
}