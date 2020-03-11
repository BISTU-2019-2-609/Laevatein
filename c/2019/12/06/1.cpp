
#include<stdio.h>

void print_x(int);
void print_n(int, char);

int main(){
    printf("Please input n:");
    int n;
    scanf("%d",&n);
    printf("Output:\n");
    print_x(n);
}

void print_x(int n){
    if(n%2!=0){
        for(int i=0;i<n-1;i++){
            print_n(i,' ');
            print_n(1,'@');
            print_n((2*n-3)-2*i,' ');
            print_n(1,'@');
            printf("\n");
        }
        print_n((2*n-1)/2,' ');
        printf("@\n");
        for(int i=n-1;i>0;i--){
            print_n(i-1,' ');
            print_n(1,'@');
            print_n((2*n-3)-2*(i-1),' ');
            print_n(1,'@');
            printf("\n");
        }
    }
    else if(n%2==0){
        for(int i=0;i<n;i++){
            print_n(i,' ');
            print_n(1,'@');
            print_n((2*n-3)-2*i+1,' ');
            print_n(1,'@');
            printf("\n");
        }
        for(int i=n;i>0;i--){
            print_n(i-1,' ');
            print_n(1,'@');
            print_n((2*n-3)-2*(i-1)+1,' ');
            print_n(1,'@');
            printf("\n");
        }
    }
}

void print_n(int n,char letter){
    for(int i=1;i<=n;i++){
        printf("%c",letter);
    }
}