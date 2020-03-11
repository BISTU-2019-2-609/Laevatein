#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#define NUM 6
void reorder(char ids[NUM][15],char names[NUM][100], int n);
int main(void)
{
    char ids[NUM][15];
    char names[NUM][100];
    int i;
    for (i = 0; i < NUM; i++) {
        scanf("%s %s", ids[i], names[i]);
    }
    reorder(ids, names, NUM);
    return 0;
}

void reorder(char ids[NUM][15],char names[NUM][100], int n)
{
    int i,j,h=1;
    double e,b[NUM];
    char a[NUM][100];
    for ( i = 0; i < NUM; i++)
    {
        b[i]=atoi(ids[i]);
    }
    for( i = 0; i < NUM-1; i++)
    {
        for( j = 0; j < NUM-1-i; j++)
        {
            if(b[j]>b[j+1])
            {
                e=b[j];
                b[j]=b[j+1];
                b[j+1]=e;
                strcpy(a[i],names[j]);
                strcpy(names[j],names[j+1]);
                strcpy(names[j+1],a[i]);
            }
        }
    }
    printf("\n");
    for (i=0;i<NUM;i++)
    {
        printf("%.0f %s\n",b[i],names[i]);
    }
    
    return;
}