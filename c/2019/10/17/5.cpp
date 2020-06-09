#include<stdio.h>
int main(){
    char w;
    int n;
    char input();
    int print_front(int n,int c);
    int print_middle(char w,int c);
    int print_last(int n,int c);
    w=input();
    n=(int) w-64;
    for(int i=1;i<=n;i++){
        print_front(n,i);
        print_middle(w,i);
    }
}

char input(){
    char w;
    while (true){
        printf("Please input a letter:\n");
        scanf("%c",&w);
        if (w>=97 && w<=122){
            w=w-32;
            break;
            return w;
        }
        else if(w>=65 && w<=90){
            break;
            return w;
        }
        else{
            scanf("%c",&w);
            printf("Your inputing is wrong, please try again.\n");
        }
    }
}

int print_front(int n,int c){
    n=n-c;
    for(int i=1;i<=n;i++){
        printf(" ");
    }
}

int print_middle(char w,int c){
    char letter='A';
    for(int i=0;i<c;i++){
        printf("%c",letter+i);
    }
    letter=letter+c-1;
    for(int i=1;i<c;i++){
        printf("%c",letter-i);
    }
}