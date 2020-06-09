#include <stdio.h>
void find_date(int *p1,int *p2,int *p3,int x);
int main(void){
    int year,month,day;
    int n=0;
    scanf("%d %d %d %d",&year,&month,&day,&n);
    find_date(&year,&month,&day,n);
    printf("%02d-%02d-%02d\n",year,month,day);
    return 0;
}

void find_date(int *p1, int *p2, int *p3, int x){
    int a[12]={31,28,31,30,31,30,31,31,30,31,30,31};
    *p3=*p3+x;
    if(*p1%4==0){
        if (*p1 % 100 == 0){
            if (*p1 % 400 == 0){
                a[2] = 29;
            }
            a[2] = 28;
        }
        a[2] = 29;
    }
    else{
        a[2] = 28;
    }
    if (*p3 > a[*p2]){
        for (; *p3 > a[*p2];){
            *p3 = *p3 - a[*p2];
            *p2++;
            if (*p2 == 13){
                *p1++;
                *p2 = 1;
            }
        }
    }
    if (*p3 < 0){
        for (; *p3 < 0;){
            *p2 = *p2 - 1;
            *p3 = a[*p2] + *p3;
            if (*p2 == 0){
                *p2 = 12;
                *p1--;
            }
        }
    }
}