#include <stdlib.h>
#include<stdio.h>
void print_sort(int *arr, int n);
int main()
{
    int a[5];
    int c;
    for(int i=0;i<5;i++){
        scanf("%d",&a[i]);
    }
    print_sort(a,5);
    return 0;
}

void print_sort(int *arr,int n){
    int b;
    int c=0;
    int i=0,j=0;
    for(i=0;i<n;i++){
        for(j=0;j<n-i;j++){
            if(*(arr+j)>*(arr+j+1)){
                b=*(arr+j+1);
                *(arr+j+1)=*(arr+j);
                *(arr+j)=b;
            }
        }
    }
    for(c;c<5;c++){
        printf("%d ",*(arr+c));
    }
}