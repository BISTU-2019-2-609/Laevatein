#include<stdio.h>

void sort(int *a,int n);

int main(){
    printf("please input n:");
    int n;
    scanf("%d",&n);
    printf("please input a[]:");
    int a[255];
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    a[n+1]=101;
    sort(a,n);
    printf("Output:\n");
    for(int i=0;i<n;i++){
        printf("%d ",a[i]);
    }
}

void sort(int *a,int n){
    int b;
    for(int i=0;i<=n;i++){
        for(int j=0;j<n-1;j++){
            if(*(a+j)>*(a+j+1)){
                b=*(a+j+1);
                *(a+j+1)=*(a+j);
                *(a+j)=b;
            }
        }
    }
}