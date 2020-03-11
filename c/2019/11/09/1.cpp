#include<stdio.h>
#include<time.h>
#include<stdlib.h>

int main(){
    int add(int,int);
    int sub(int,int);
    int mult(int,int);
    float divi(int,int);
    float get_ans();
    bool judge(float,float);
    printf("Here are ten random calculation questions. Please answer them.\n");
    srand((unsigned) time(NULL));
    int a,b,op,n,op_string;
    bool res;
    for(int i=1;i<=10;i++){
        a=(int) 10*(rand()/(float) RAND_MAX)+1;
        b=(int) 10*(rand()/(float) RAND_MAX)+1;
        op=(int) 4*(rand()/(float) RAND_MAX)+1;
        if (op==1){
            printf("No.%d:\033[4;1m%d+%d\n\033[0mYour answer:",i,a,b);
            res=judge(get_ans(),(float) add(a,b));
            if (res){
                n++;
            }
        }
        else if(op==2){
            printf("No.%d:\033[4;1m%d-%d\n\033[0mYour answer:",i,a,b);
            res=judge(get_ans(),(float) sub(a,b));
            if (res){
                n++;
            }
        }
        else if(op==3){
            printf("No.%d:\033[4;1m%d*%d\n\033[0mYour answer:",i,a,b);
            res=judge(get_ans(),(float) mult(a,b));
            if (res){
                n++;
            }
        }
        else if(op==4){
            printf("No.%d:\033[4;1m%d/%d\n\033[0mYour answer:",i,a,b);
            res=judge(get_ans(),divi(a,b));
            if (res){
                n++;
            }
        }
    }
    printf("End of answer.\nYou answered %d question(s) correctly.\n",n);
}

int add(int a,int b){
    return a+b;
}

int sub(int a, int b){
    return a-b;
}

int mult(int a, int b){
    return a*b;
}

float divi(int a,int b){
    return (float)a/(float)b;
}

float get_ans(){
    float ans;
    scanf("%f",&ans);
    return ans;
}

bool judge(float a,float b){
    if(a==b){
        printf("\033[32mYour answer is Correct!\033[0m\n");
    }
    else{
        printf("\033[31mYour answer is Wrong!\033[0m\n");
    }
    return a==b;
}