#include<stdio.h>
int main(){
    int a[2][3]={{1,2,3},{4,5,6}};
    int b[3][2]={{1,5},{5,3},{8,1}};
    int c[2][2]={{0,0},{0,0}};
    for(int f=0;f<2;f++){
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                c[i][f]=c[i][f]+a[i][j]*b[j][f];
            }
        }
    }
    for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
            printf("%d ",c[i][j]);
        }
        printf("\n");
    }
}