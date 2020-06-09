#include<stdio.h>
int main(){
    float a[5],b[5],c[5],d[5],e[5],u[5];
    float f=0,g=0,h=0,j=0,k=0,l=0,v=0,t,y,m,n,o,p,q;
    int i;
    float x[2][5]={{m,n,o,p,q},{0,1,2,3,4}};
    printf("分别输入每个学生的五个课程的成绩，每个分数以空格分割，以回车结束。\n");
    printf("学生0:");
    for(i=0;i<5;i++){
        scanf("%f",&a[i]);
    }
    printf("学生1:");
    for(i=0;i<5;i++){
        scanf("%f",&b[i]);
    }
    printf("学生2:");
    for(i=0;i<5;i++){
        scanf("%f",&c[i]);
    }
    printf("学生3:");
    for(i=0;i<5;i++){
        scanf("%f",&d[i]);
    }
    printf("学生4:");
    for(i=0;i<5;i++){
        scanf("%f",&e[i]);
    }
    printf("学生5:");
    for(i=0;i<5;i++){
        scanf("%f",&u[i]);
    }
    for(i=0;i<5;i++){
        f=f+a[i];
        g=g+b[i];
        h=h+c[i];
        j=j+d[i];
        k=k+e[i];
        v=v+u[i];
    }
    float z[2][6]={{f/5,g/5,h/5,j/5,k/5,v/5},{0,1,2,3,4,5}};
    printf("\n每位学生平均分:\n学生0:%.2f\n学生1:%.2f\n学生2:%.2f\n学生3:%.2f\n学生4:%.2f\n学生5:%.2f\n\n每个课程平均分:\n",f/5,g/5,h/5,j/5,k/5,v/5);
    for(i=0;i<5;i++){
        l=(a[i]+b[i]+c[i]+d[i]+e[i]+u[i])/6;
        x[0][i]=l;
        printf("课程%d:%.2f\n",i,l);
    }
    for(i=1;i<6;i++){
        if(z[0][i-1]>z[0][i]){
            t=z[0][i-1]; 
            z[0][i-1]=z[0][i];
            z[0][i]=t;
            y=z[1][i-1];
            z[1][i-1]=z[1][i];
            z[1][i]=y;
        }
    }
    for(i=1;i<5;i++){
        if(x[0][i-1]>x[0][i]){
            t=x[0][i-1];
            x[0][i-1]=x[0][i];
            x[0][i]=t;
            y=x[1][i-1];
            x[1][i-1]=x[1][i];
            x[1][i]=y;
        }
    }
    printf("\n平均分最高的学生及分数:\n学生:%.0f\n分数:%.2f\n\n平均分最高的学科及分数:\n学科:%.0f\n分数:%.2f\n",z[1][5],z[0][5],x[1][4],x[0][4]);
    }